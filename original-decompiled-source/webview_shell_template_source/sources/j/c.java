package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f13382f;

    /* renamed from: a, reason: collision with root package name */
    public int f13383a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f13384b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f13385c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f13386d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f13387e;

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f13387e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f13386d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f13386d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f13384b == null) {
            this.f13384b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13384b.setTo(theme);
            }
        }
        this.f13384b.applyStyle(this.f13383a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f13387e == null) {
            Configuration configuration = this.f13386d;
            if (configuration == null) {
                this.f13387e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f13382f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f13382f = configuration2;
                    }
                    if (configuration.equals(f13382f)) {
                    }
                }
                this.f13387e = createConfigurationContext(this.f13386d).getResources();
            }
        }
        return this.f13387e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13385c == null) {
            this.f13385c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13385c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13384b;
        if (theme != null) {
            return theme;
        }
        if (this.f13383a == 0) {
            this.f13383a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f13384b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        if (this.f13383a != i6) {
            this.f13383a = i6;
            b();
        }
    }

    public c(Context context, int i6) {
        super(context);
        this.f13383a = i6;
    }
}
