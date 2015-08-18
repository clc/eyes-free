package com.googlecode.eyesfree.utils;

import android.content.Context;
import android.content.res.Resources;

/**
 * Utility methods for retrieving information about the dimensions of the screen
 */
public class ScreenDimensionUtils {
    /**
     * Get the current nav bar height
     * @param context
     * @return The current nav bar height in dps
     */
    public static int getNavBarHeight(final Context context) {
        int navBarHeight;
        try {
            /* TODO(pweaver) Identify or request robust APIs to obtain the nav bar height */
            final Resources resources = context.getResources();
            navBarHeight = resources.getDimensionPixelSize(
                    resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Resources.NotFoundException e) {
            navBarHeight = 0;
        }

        return navBarHeight;
    }

    /**
     * Get the current status bar height
     * @param context
     * @return The current status bar height in dps
     */
    public static int getStatusBarHeight(final Context context) {
        int statusBarHeight;
        try {
            /* TODO(pweaver) Identify or request robust APIs to obtain the status bar height */
            final Resources resources = context.getResources();
            statusBarHeight = resources.getDimensionPixelSize(
                    resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Resources.NotFoundException e) {
            statusBarHeight = 0;
        }

        return statusBarHeight;
    }
}

