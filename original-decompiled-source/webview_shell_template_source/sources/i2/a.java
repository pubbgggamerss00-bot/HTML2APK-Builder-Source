package i2;

import android.os.Build;
import i2.k;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a implements i2.c {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f13344c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f13345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13346b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: i2.a$a, reason: collision with other inner class name */
    public static class C0067a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f13347a = new HashSet(Arrays.asList(k.b.f13361a.b()));
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends a {
        @Override // i2.a
        public final boolean c() {
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends a {
        @Override // i2.a
        public final boolean c() {
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends a {
        @Override // i2.a
        public final boolean c() {
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e extends a {
        @Override // i2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends a {
        @Override // i2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g extends a {
        @Override // i2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h extends a {
        @Override // i2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i extends a {
        @Override // i2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f13345a = str;
        this.f13346b = str2;
        f13344c.add(this);
    }

    @Override // i2.c
    public final String a() {
        return this.f13345a;
    }

    @Override // i2.c
    public final boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = C0067a.f13347a;
        String str = this.f13346b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
