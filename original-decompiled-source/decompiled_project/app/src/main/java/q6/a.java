package q6;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import q6.j;

/* loaded from: classes.dex */
public abstract class a implements q6.d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f22059c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f22060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22061b;

    /* renamed from: q6.a$a, reason: collision with other inner class name */
    public static class C0247a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f22062a = new HashSet(Arrays.asList(j.b.f22075a.a()));
    }

    public static class b extends a {
        @Override // q6.a
        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        @Override // q6.a
        public final boolean c() {
            return true;
        }
    }

    public static class d extends a {
        @Override // q6.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        @Override // q6.a
        public final boolean c() {
            return true;
        }
    }

    public static class f extends a {
        @Override // q6.a
        public final boolean c() {
            return true;
        }
    }

    public static class g extends a {
        @Override // q6.a
        public final boolean c() {
            return true;
        }
    }

    public static class h extends a {
        @Override // q6.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        @Override // q6.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f22060a = str;
        this.f22061b = str2;
        f22059c.add(this);
    }

    @Override // q6.d
    public final boolean a() {
        return c() || d();
    }

    @Override // q6.d
    public final String b() {
        return this.f22060a;
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = C0247a.f22062a;
        String str = this.f22061b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
