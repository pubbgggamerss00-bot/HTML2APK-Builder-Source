package s6;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final e f24527b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final String f24528c = e.class.getSimpleName();

    public static Rect b(Activity activity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = f24528c;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(str, e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e11) {
            Log.w(str, e11);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e12) {
            Log.w(str, e12);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e13) {
            Log.w(str, e13);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        r.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i10 = rect.bottom + dimensionPixelSize;
            if (i10 == point.y) {
                rect.bottom = i10;
            } else {
                int i11 = rect.right + dimensionPixelSize;
                if (i11 == point.x) {
                    rect.right = i11;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (ClassNotFoundException e14) {
                Log.w(str, e14);
            } catch (IllegalAccessException e15) {
                Log.w(str, e15);
            } catch (InstantiationException e16) {
                Log.w(str, e16);
            } catch (NoSuchFieldException e17) {
                Log.w(str, e17);
            } catch (NoSuchMethodException e18) {
                Log.w(str, e18);
            } catch (InvocationTargetException e19) {
                Log.w(str, e19);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // s6.d
    public final c a(Activity activity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Rect rectB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rectB = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            r.d(rectB, "activity.windowManager.currentWindowMetrics.bounds");
        } else if (i10 >= 29) {
            String str = f24528c;
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectB = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e10) {
                Log.w(str, e10);
                rectB = b(activity);
            } catch (NoSuchFieldException e11) {
                Log.w(str, e11);
                rectB = b(activity);
            } catch (NoSuchMethodException e12) {
                Log.w(str, e12);
                rectB = b(activity);
            } catch (InvocationTargetException e13) {
                Log.w(str, e13);
                rectB = b(activity);
            }
        } else {
            rectB = b(activity);
        }
        return new c(rectB);
    }
}
