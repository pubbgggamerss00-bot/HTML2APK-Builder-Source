package w1;

import androidx.datastore.preferences.protobuf.a1;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q1.b1;
import q1.i2;
import qg.z;
import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static int f31067k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f31068l = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f31069a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31070b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31071c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31072d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31073e;

    /* renamed from: f, reason: collision with root package name */
    public final l f31074f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31075g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31076h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f31077i;

    /* renamed from: j, reason: collision with root package name */
    public final int f31078j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f31079a;

        /* renamed from: b, reason: collision with root package name */
        public final float f31080b;

        /* renamed from: c, reason: collision with root package name */
        public final float f31081c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31082d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31083e;

        /* renamed from: f, reason: collision with root package name */
        public final long f31084f;

        /* renamed from: g, reason: collision with root package name */
        public final int f31085g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f31086h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList<C0314a> f31087i;

        /* renamed from: j, reason: collision with root package name */
        public final C0314a f31088j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f31089k;

        /* renamed from: w1.d$a$a, reason: collision with other inner class name */
        public static final class C0314a {

            /* renamed from: a, reason: collision with root package name */
            public final String f31090a;

            /* renamed from: b, reason: collision with root package name */
            public final float f31091b;

            /* renamed from: c, reason: collision with root package name */
            public final float f31092c;

            /* renamed from: d, reason: collision with root package name */
            public final float f31093d;

            /* renamed from: e, reason: collision with root package name */
            public final float f31094e;

            /* renamed from: f, reason: collision with root package name */
            public final float f31095f;

            /* renamed from: g, reason: collision with root package name */
            public final float f31096g;

            /* renamed from: h, reason: collision with root package name */
            public final float f31097h;

            /* renamed from: i, reason: collision with root package name */
            public final List<? extends g> f31098i;

            /* renamed from: j, reason: collision with root package name */
            public final ArrayList f31099j;

            public C0314a() {
                this(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 1023);
            }

            public C0314a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
                str = (i10 & 1) != 0 ? "" : str;
                f10 = (i10 & 2) != 0 ? 0.0f : f10;
                f11 = (i10 & 4) != 0 ? 0.0f : f11;
                f12 = (i10 & 8) != 0 ? 0.0f : f12;
                f13 = (i10 & 16) != 0 ? 1.0f : f13;
                f14 = (i10 & 32) != 0 ? 1.0f : f14;
                f15 = (i10 & 64) != 0 ? 0.0f : f15;
                f16 = (i10 & 128) != 0 ? 0.0f : f16;
                if ((i10 & 256) != 0) {
                    int i11 = m.f31210a;
                    list = z.f22752a;
                }
                ArrayList arrayList = new ArrayList();
                this.f31090a = str;
                this.f31091b = f10;
                this.f31092c = f11;
                this.f31093d = f12;
                this.f31094e = f13;
                this.f31095f = f14;
                this.f31096g = f15;
                this.f31097h = f16;
                this.f31098i = list;
                this.f31099j = arrayList;
            }
        }

        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11) {
            str = (i11 & 1) != 0 ? "" : str;
            long j11 = (i11 & 32) != 0 ? b1.f21654h : j10;
            int i12 = (i11 & 64) != 0 ? 5 : i10;
            this.f31079a = str;
            this.f31080b = f10;
            this.f31081c = f11;
            this.f31082d = f12;
            this.f31083e = f13;
            this.f31084f = j11;
            this.f31085g = i12;
            this.f31086h = z10;
            ArrayList<C0314a> arrayList = new ArrayList<>();
            this.f31087i = arrayList;
            C0314a c0314a = new C0314a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 1023);
            this.f31088j = c0314a;
            arrayList.add(c0314a);
        }

        public static void a(a aVar, ArrayList arrayList, int i10, i2 i2Var) {
            if (aVar.f31089k) {
                f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C0314a) l.b.b(aVar.f31087i, 1)).f31099j.add(new q("", arrayList, i10, i2Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        }

        public final d b() {
            if (this.f31089k) {
                f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C0314a> arrayList = this.f31087i;
                if (arrayList.size() <= 1) {
                    C0314a c0314a = this.f31088j;
                    d dVar = new d(this.f31079a, this.f31080b, this.f31081c, this.f31082d, this.f31083e, new l(c0314a.f31090a, c0314a.f31091b, c0314a.f31092c, c0314a.f31093d, c0314a.f31094e, c0314a.f31095f, c0314a.f31096g, c0314a.f31097h, c0314a.f31098i, c0314a.f31099j), this.f31084f, this.f31085g, this.f31086h);
                    this.f31089k = true;
                    return dVar;
                }
                if (this.f31089k) {
                    f2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C0314a c0314aRemove = arrayList.remove(arrayList.size() - 1);
                ((C0314a) l.b.b(arrayList, 1)).f31099j.add(new l(c0314aRemove.f31090a, c0314aRemove.f31091b, c0314aRemove.f31092c, c0314aRemove.f31093d, c0314aRemove.f31094e, c0314aRemove.f31095f, c0314aRemove.f31096g, c0314aRemove.f31097h, c0314aRemove.f31098i, c0314aRemove.f31099j));
            }
        }
    }

    public static final class b {
    }

    public d(String str, float f10, float f11, float f12, float f13, l lVar, long j10, int i10, boolean z10) {
        int i11;
        synchronized (f31068l) {
            i11 = f31067k;
            f31067k = i11 + 1;
        }
        this.f31069a = str;
        this.f31070b = f10;
        this.f31071c = f11;
        this.f31072d = f12;
        this.f31073e = f13;
        this.f31074f = lVar;
        this.f31075g = j10;
        this.f31076h = i10;
        this.f31077i = z10;
        this.f31078j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r.a(this.f31069a, dVar.f31069a) && f3.h.a(this.f31070b, dVar.f31070b) && f3.h.a(this.f31071c, dVar.f31071c) && this.f31072d == dVar.f31072d && this.f31073e == dVar.f31073e && this.f31074f.equals(dVar.f31074f) && b1.d(this.f31075g, dVar.f31075g) && this.f31076h == dVar.f31076h && this.f31077i == dVar.f31077i;
    }

    public final int hashCode() {
        int iHashCode = (this.f31074f.hashCode() + z1.a(this.f31073e, z1.a(this.f31072d, z1.a(this.f31071c, z1.a(this.f31070b, this.f31069a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = b1.f21655i;
        return Boolean.hashCode(this.f31077i) + a1.a(this.f31076h, e2.a(iHashCode, 31, this.f31075g), 31);
    }
}
