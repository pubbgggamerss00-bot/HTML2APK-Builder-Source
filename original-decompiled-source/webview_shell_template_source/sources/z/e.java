package z;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    public a A;
    public boolean s;

    /* renamed from: w, reason: collision with root package name */
    public float f15416w;

    /* renamed from: t, reason: collision with root package name */
    public int f15413t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f15414u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f15415v = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15417x = false;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f15418y = new float[9];

    /* renamed from: z, reason: collision with root package name */
    public final float[] f15419z = new float[9];
    public b[] B = new b[16];
    public int C = 0;
    public int D = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static final a s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f15420t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f15421u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f15422v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ a[] f15423w;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            s = aVar;
            a aVar2 = new a("CONSTANT", 1);
            a aVar3 = new a("SLACK", 2);
            f15420t = aVar3;
            a aVar4 = new a("ERROR", 3);
            f15421u = aVar4;
            a aVar5 = new a("UNKNOWN", 4);
            f15422v = aVar5;
            f15423w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f15423w.clone();
        }
    }

    public e(a aVar) {
        this.A = aVar;
    }

    public final void a(b bVar) {
        int i6 = 0;
        while (true) {
            int i7 = this.C;
            if (i6 >= i7) {
                b[] bVarArr = this.B;
                if (i7 >= bVarArr.length) {
                    this.B = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.B;
                int i8 = this.C;
                bVarArr2[i8] = bVar;
                this.C = i8 + 1;
                return;
            }
            if (this.B[i6] == bVar) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void b(b bVar) {
        int i6 = this.C;
        int i7 = 0;
        while (i7 < i6) {
            if (this.B[i7] == bVar) {
                while (i7 < i6 - 1) {
                    b[] bVarArr = this.B;
                    int i8 = i7 + 1;
                    bVarArr[i7] = bVarArr[i8];
                    i7 = i8;
                }
                this.C--;
                return;
            }
            i7++;
        }
    }

    public final void c() {
        this.A = a.f15422v;
        this.f15415v = 0;
        this.f15413t = -1;
        this.f15414u = -1;
        this.f15416w = 0.0f;
        this.f15417x = false;
        int i6 = this.C;
        for (int i7 = 0; i7 < i6; i7++) {
            this.B[i7] = null;
        }
        this.C = 0;
        this.D = 0;
        this.s = false;
        Arrays.fill(this.f15419z, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f15413t - eVar.f15413t;
    }

    public final void d(c cVar, float f6) {
        this.f15416w = f6;
        this.f15417x = true;
        int i6 = this.C;
        this.f15414u = -1;
        for (int i7 = 0; i7 < i6; i7++) {
            this.B[i7].h(cVar, this, false);
        }
        this.C = 0;
    }

    public final void e(c cVar, b bVar) {
        int i6 = this.C;
        for (int i7 = 0; i7 < i6; i7++) {
            this.B[i7].i(cVar, bVar, false);
        }
        this.C = 0;
    }

    public final String toString() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + this.f15413t;
    }
}
