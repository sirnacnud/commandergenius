LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

XERCES_SUBDIRS := $(patsubst $(LOCAL_PATH)/%, %, $(shell find $(LOCAL_PATH)/src/xercesc/ -type d))

LOCAL_MODULE := xerces

LOCAL_C_INCLUDES := $(LOCAL_PATH) $(LOCAL_PATH)/src $(LOCAL_PATH)/include \
                    $(LOCAL_PATH)/.. $(LOCAL_PATH)/include/xercesc/util $(LOCAL_PATH)/include/xercesc/util/MsgLoaders/InMemory \
                    $(LOCAL_PATH)/include/xercesc/dom/ $(LOCAL_PATH)/include/xercesc/dom/impl \
                    $(LOCAL_PATH)/include/xercesc/validators/schema/identity $(LOCAL_PATH)/include/xercesc/util/Transcoders/IconvGNU/ \
                    $(LOCAL_PATH)/include/xercesc/sax
LOCAL_CFLAGS := -Os -DHAVE_CONFIG_H -D__sF=__SDL_fake_stdout

LOCAL_CPP_EXTENSION := .cpp

LOCAL_SRC_FILES := $(addprefix src/,$(notdir $(wildcard $(LOCAL_PATH)/src/*.cpp $(LOCAL_PATH)/src/*.c)))
LOCAL_SRC_FILES += $(foreach F, $(XERCES_SUBDIRS), $(addprefix $(F)/,$(notdir $(wildcard $(LOCAL_PATH)/$(F)/*.cpp))))

LOCAL_SHARED_LIBRARIES := sdl-$(SDL_VERSION)

include $(BUILD_STATIC_LIBRARY)
