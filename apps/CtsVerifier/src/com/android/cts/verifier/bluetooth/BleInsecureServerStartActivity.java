/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.cts.verifier.bluetooth;

import android.content.Intent;
import android.os.Bundle;

public class BleInsecureServerStartActivity extends BleServerTestBaseActivity {
    private Intent mIntent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIntent = new Intent(this, BleServerService.class);
        mIntent.setAction(BleServerService.BLE_ACTION_SERVER_NON_SECURE);
        startService(mIntent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopService(mIntent);
    }
}
