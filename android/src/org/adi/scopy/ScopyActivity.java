/*
 * Copyright (c) 2021 Analog Devices Inc.
 *
 * This file is part of Scopy
 * (see http://www.github.com/analogdevicesinc/scopy).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.adi.scopy;

import java.io.File;
import java.io.IOException;
import org.qtproject.qt5.android.bindings.QtActivity;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.content.Context;
import android.content.ComponentName;
import android.os.Bundle;

public class ScopyActivity extends QtActivity
{
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
        }

        @Override
        protected void onStart()
        {
                super.onStart();
        }

        @Override
        protected void onStop()
        {
                super.onStop();
        }

	public void restart() {
	    System.out.println("-- ScopyActivity: Restarting ");
	    Context context = getApplicationContext();
	    PackageManager packageManager = context.getPackageManager();
	    Intent intent = packageManager.getLaunchIntentForPackage(context.getPackageName());
	    ComponentName componentName = intent.getComponent();
	    Intent mainIntent = Intent.makeRestartActivityTask(componentName);
	    context.startActivity(mainIntent);
	    Runtime.getRuntime().exit(0);
    }
}
