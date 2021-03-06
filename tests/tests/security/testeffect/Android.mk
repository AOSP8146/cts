# Copyright (C) 2013 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

LOCAL_PATH:= $(call my-dir)

# Test effect library
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
  CTSTestEffect.cpp

LOCAL_CFLAGS+= -O2 -fvisibility=hidden

LOCAL_MODULE_RELATIVE_PATH := soundfx
LOCAL_MODULE:= libctstesteffect

LOCAL_C_INCLUDES := \
  $(call include-path-for, audio-effects)

LOCAL_CFLAGS := -Wno-unused-parameter

include $(BUILD_SHARED_LIBRARY)
