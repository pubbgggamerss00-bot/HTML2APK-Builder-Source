package g;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f13145b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13146c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13147d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13148e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13149f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f13150g = {"android.widget.", "android.view.", "android.webkit."};
    public static final w.g<String, Constructor<? extends View>> h = new w.g<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13151a = new Object[2];

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements View.OnClickListener {
        public final View s;

        /* renamed from: t, reason: collision with root package name */
        public final String f13152t;

        /* renamed from: u, reason: collision with root package name */
        public Method f13153u;

        /* renamed from: v, reason: collision with root package name */
        public Context f13154v;

        public a(String str, View view) {
            this.s = view;
            this.f13152t = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String str;
            Method method;
            if (this.f13153u == null) {
                View view2 = this.s;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f13152t;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f13153u = method;
                            this.f13154v = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f13153u.invoke(this.f13154v, view);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException("Could not execute method for android:onClick", e7);
            }
        }
    }

    public l.c a(Context context, AttributeSet attributeSet) {
        return new l.c(context, attributeSet);
    }

    public l.e b(Context context, AttributeSet attributeSet) {
        return new l.e(context, attributeSet);
    }

    public l.f c(Context context, AttributeSet attributeSet) {
        return new l.f(context, attributeSet);
    }

    public l.s d(Context context, AttributeSet attributeSet) {
        return new l.s(context, attributeSet);
    }

    public c0 e(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        w.g<String, Constructor<? extends View>> gVar = h;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f13145b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f13151a);
    }
}
