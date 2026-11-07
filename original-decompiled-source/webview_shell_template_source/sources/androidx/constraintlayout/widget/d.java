package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.k0;
import androidx.camera.core.impl.ImageFormatConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.google.android.gms.internal.ads.dn;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f818d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f819e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f820f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.widget.b> f821a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f822b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, a> f823c = new HashMap<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f824a;

        /* renamed from: b, reason: collision with root package name */
        public final C0012d f825b;

        /* renamed from: c, reason: collision with root package name */
        public final c f826c;

        /* renamed from: d, reason: collision with root package name */
        public final b f827d;

        /* renamed from: e, reason: collision with root package name */
        public final e f828e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f829f;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0011a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f830a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f831b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f832c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f833d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f834e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            public int f835f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f836g = new int[5];
            public String[] h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            public int f837i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f838j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f839k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f840l = 0;

            public final void a(float f6, int i6) {
                int i7 = this.f835f;
                int[] iArr = this.f833d;
                if (i7 >= iArr.length) {
                    this.f833d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f834e;
                    this.f834e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f833d;
                int i8 = this.f835f;
                iArr2[i8] = i6;
                float[] fArr2 = this.f834e;
                this.f835f = i8 + 1;
                fArr2[i8] = f6;
            }

            public final void b(int i6, int i7) {
                int i8 = this.f832c;
                int[] iArr = this.f830a;
                if (i8 >= iArr.length) {
                    this.f830a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f831b;
                    this.f831b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f830a;
                int i9 = this.f832c;
                iArr3[i9] = i6;
                int[] iArr4 = this.f831b;
                this.f832c = i9 + 1;
                iArr4[i9] = i7;
            }

            public final void c(int i6, String str) {
                int i7 = this.f837i;
                int[] iArr = this.f836g;
                if (i7 >= iArr.length) {
                    this.f836g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f836g;
                int i8 = this.f837i;
                iArr2[i8] = i6;
                String[] strArr2 = this.h;
                this.f837i = i8 + 1;
                strArr2[i8] = str;
            }

            public final void d(int i6, boolean z6) {
                int i7 = this.f840l;
                int[] iArr = this.f838j;
                if (i7 >= iArr.length) {
                    this.f838j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f839k;
                    this.f839k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f838j;
                int i8 = this.f840l;
                iArr2[i8] = i6;
                boolean[] zArr2 = this.f839k;
                this.f840l = i8 + 1;
                zArr2[i8] = z6;
            }
        }

        public a() {
            C0012d c0012d = new C0012d();
            c0012d.f889a = 0;
            c0012d.f890b = 0;
            c0012d.f891c = 1.0f;
            c0012d.f892d = Float.NaN;
            this.f825b = c0012d;
            c cVar = new c();
            cVar.f881a = -1;
            cVar.f882b = 0;
            cVar.f883c = -1;
            cVar.f884d = Float.NaN;
            cVar.f885e = Float.NaN;
            cVar.f886f = Float.NaN;
            cVar.f887g = -1;
            cVar.h = null;
            cVar.f888i = -1;
            this.f826c = cVar;
            this.f827d = new b();
            e eVar = new e();
            eVar.f894a = 0.0f;
            eVar.f895b = 0.0f;
            eVar.f896c = 0.0f;
            eVar.f897d = 1.0f;
            eVar.f898e = 1.0f;
            eVar.f899f = Float.NaN;
            eVar.f900g = Float.NaN;
            eVar.h = -1;
            eVar.f901i = 0.0f;
            eVar.f902j = 0.0f;
            eVar.f903k = 0.0f;
            eVar.f904l = false;
            eVar.f905m = 0.0f;
            this.f828e = eVar;
            this.f829f = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.f827d;
            aVar.f757e = bVar.h;
            aVar.f759f = bVar.f856i;
            aVar.f761g = bVar.f858j;
            aVar.h = bVar.f860k;
            aVar.f764i = bVar.f862l;
            aVar.f766j = bVar.f864m;
            aVar.f768k = bVar.f866n;
            aVar.f770l = bVar.f868o;
            aVar.f772m = bVar.f870p;
            aVar.f774n = bVar.f871q;
            aVar.f776o = bVar.f872r;
            aVar.s = bVar.s;
            aVar.f782t = bVar.f873t;
            aVar.f783u = bVar.f874u;
            aVar.f784v = bVar.f875v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.f786x = bVar.N;
            aVar.f788z = bVar.P;
            aVar.E = bVar.f876w;
            aVar.F = bVar.f877x;
            aVar.f778p = bVar.f879z;
            aVar.f779q = bVar.A;
            aVar.f781r = bVar.B;
            aVar.G = bVar.f878y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.f863l0;
            aVar.X = bVar.f865m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.f842a0;
            aVar.N = bVar.f844b0;
            aVar.O = bVar.f846c0;
            aVar.R = bVar.f848d0;
            aVar.S = bVar.f850e0;
            aVar.V = bVar.E;
            aVar.f753c = bVar.f851f;
            aVar.f749a = bVar.f847d;
            aVar.f751b = bVar.f849e;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f843b;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f845c;
            String str = bVar.f861k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f869o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(bVar.J);
            aVar.a();
        }

        public final void b(int i6, ConstraintLayout.a aVar) {
            this.f824a = i6;
            int i7 = aVar.f757e;
            b bVar = this.f827d;
            bVar.h = i7;
            bVar.f856i = aVar.f759f;
            bVar.f858j = aVar.f761g;
            bVar.f860k = aVar.h;
            bVar.f862l = aVar.f764i;
            bVar.f864m = aVar.f766j;
            bVar.f866n = aVar.f768k;
            bVar.f868o = aVar.f770l;
            bVar.f870p = aVar.f772m;
            bVar.f871q = aVar.f774n;
            bVar.f872r = aVar.f776o;
            bVar.s = aVar.s;
            bVar.f873t = aVar.f782t;
            bVar.f874u = aVar.f783u;
            bVar.f875v = aVar.f784v;
            bVar.f876w = aVar.E;
            bVar.f877x = aVar.F;
            bVar.f878y = aVar.G;
            bVar.f879z = aVar.f778p;
            bVar.A = aVar.f779q;
            bVar.B = aVar.f781r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f851f = aVar.f753c;
            bVar.f847d = aVar.f749a;
            bVar.f849e = aVar.f751b;
            bVar.f843b = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f845c = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.f863l0 = aVar.W;
            bVar.f865m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.f842a0 = aVar.Q;
            bVar.f844b0 = aVar.N;
            bVar.f846c0 = aVar.O;
            bVar.f848d0 = aVar.R;
            bVar.f850e0 = aVar.S;
            bVar.f861k0 = aVar.Y;
            bVar.N = aVar.f786x;
            bVar.P = aVar.f788z;
            bVar.M = aVar.f785w;
            bVar.O = aVar.f787y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.f869o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            bVar.K = aVar.getMarginStart();
        }

        public final void c(int i6, e.a aVar) {
            b(i6, aVar);
            this.f825b.f891c = aVar.f906r0;
            float f6 = aVar.f909u0;
            e eVar = this.f828e;
            eVar.f894a = f6;
            eVar.f895b = aVar.f910v0;
            eVar.f896c = aVar.f911w0;
            eVar.f897d = aVar.f912x0;
            eVar.f898e = aVar.f913y0;
            eVar.f899f = aVar.f914z0;
            eVar.f900g = aVar.A0;
            eVar.f901i = aVar.B0;
            eVar.f902j = aVar.C0;
            eVar.f903k = aVar.D0;
            eVar.f905m = aVar.f908t0;
            eVar.f904l = aVar.f907s0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.f827d;
            bVar.getClass();
            b bVar2 = this.f827d;
            bVar.f841a = bVar2.f841a;
            bVar.f843b = bVar2.f843b;
            bVar.f845c = bVar2.f845c;
            bVar.f847d = bVar2.f847d;
            bVar.f849e = bVar2.f849e;
            bVar.f851f = bVar2.f851f;
            bVar.f853g = bVar2.f853g;
            bVar.h = bVar2.h;
            bVar.f856i = bVar2.f856i;
            bVar.f858j = bVar2.f858j;
            bVar.f860k = bVar2.f860k;
            bVar.f862l = bVar2.f862l;
            bVar.f864m = bVar2.f864m;
            bVar.f866n = bVar2.f866n;
            bVar.f868o = bVar2.f868o;
            bVar.f870p = bVar2.f870p;
            bVar.f871q = bVar2.f871q;
            bVar.f872r = bVar2.f872r;
            bVar.s = bVar2.s;
            bVar.f873t = bVar2.f873t;
            bVar.f874u = bVar2.f874u;
            bVar.f875v = bVar2.f875v;
            bVar.f876w = bVar2.f876w;
            bVar.f877x = bVar2.f877x;
            bVar.f878y = bVar2.f878y;
            bVar.f879z = bVar2.f879z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f842a0 = bVar2.f842a0;
            bVar.f844b0 = bVar2.f844b0;
            bVar.f846c0 = bVar2.f846c0;
            bVar.f848d0 = bVar2.f848d0;
            bVar.f850e0 = bVar2.f850e0;
            bVar.f852f0 = bVar2.f852f0;
            bVar.f854g0 = bVar2.f854g0;
            bVar.f855h0 = bVar2.f855h0;
            bVar.f861k0 = bVar2.f861k0;
            int[] iArr = bVar2.f857i0;
            if (iArr == null || bVar2.f859j0 != null) {
                bVar.f857i0 = null;
            } else {
                bVar.f857i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f859j0 = bVar2.f859j0;
            bVar.f863l0 = bVar2.f863l0;
            bVar.f865m0 = bVar2.f865m0;
            bVar.f867n0 = bVar2.f867n0;
            bVar.f869o0 = bVar2.f869o0;
            c cVar = aVar.f826c;
            cVar.getClass();
            c cVar2 = this.f826c;
            cVar2.getClass();
            cVar.f881a = cVar2.f881a;
            cVar.f883c = cVar2.f883c;
            cVar.f885e = cVar2.f885e;
            cVar.f884d = cVar2.f884d;
            C0012d c0012d = this.f825b;
            int i6 = c0012d.f889a;
            C0012d c0012d2 = aVar.f825b;
            c0012d2.f889a = i6;
            c0012d2.f891c = c0012d.f891c;
            c0012d2.f892d = c0012d.f892d;
            c0012d2.f890b = c0012d.f890b;
            e eVar = aVar.f828e;
            eVar.getClass();
            e eVar2 = this.f828e;
            eVar2.getClass();
            eVar.f894a = eVar2.f894a;
            eVar.f895b = eVar2.f895b;
            eVar.f896c = eVar2.f896c;
            eVar.f897d = eVar2.f897d;
            eVar.f898e = eVar2.f898e;
            eVar.f899f = eVar2.f899f;
            eVar.f900g = eVar2.f900g;
            eVar.h = eVar2.h;
            eVar.f901i = eVar2.f901i;
            eVar.f902j = eVar2.f902j;
            eVar.f903k = eVar2.f903k;
            eVar.f904l = eVar2.f904l;
            eVar.f905m = eVar2.f905m;
            aVar.f824a = this.f824a;
            return aVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static final SparseIntArray p0;

        /* renamed from: b, reason: collision with root package name */
        public int f843b;

        /* renamed from: c, reason: collision with root package name */
        public int f845c;

        /* renamed from: i0, reason: collision with root package name */
        public int[] f857i0;

        /* renamed from: j0, reason: collision with root package name */
        public String f859j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f861k0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f841a = false;

        /* renamed from: d, reason: collision with root package name */
        public int f847d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f849e = -1;

        /* renamed from: f, reason: collision with root package name */
        public float f851f = -1.0f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f853g = true;
        public int h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f856i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f858j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f860k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f862l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f864m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f866n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f868o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f870p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f871q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f872r = -1;
        public int s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f873t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f874u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f875v = -1;

        /* renamed from: w, reason: collision with root package name */
        public float f876w = 0.5f;

        /* renamed from: x, reason: collision with root package name */
        public float f877x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public String f878y = null;

        /* renamed from: z, reason: collision with root package name */
        public int f879z = -1;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f842a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f844b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f846c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public float f848d0 = 1.0f;

        /* renamed from: e0, reason: collision with root package name */
        public float f850e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public int f852f0 = -1;

        /* renamed from: g0, reason: collision with root package name */
        public int f854g0 = 0;

        /* renamed from: h0, reason: collision with root package name */
        public int f855h0 = -1;

        /* renamed from: l0, reason: collision with root package name */
        public boolean f863l0 = false;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f865m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f867n0 = true;

        /* renamed from: o0, reason: collision with root package name */
        public int f869o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12769f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                SparseIntArray sparseIntArray = p0;
                int i7 = sparseIntArray.get(index);
                switch (i7) {
                    case 1:
                        this.f870p = d.f(typedArrayObtainStyledAttributes, index, this.f870p);
                        break;
                    case 2:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f868o = d.f(typedArrayObtainStyledAttributes, index, this.f868o);
                        break;
                    case 4:
                        this.f866n = d.f(typedArrayObtainStyledAttributes, index, this.f866n);
                        break;
                    case 5:
                        this.f878y = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f875v = d.f(typedArrayObtainStyledAttributes, index, this.f875v);
                        break;
                    case 10:
                        this.f874u = d.f(typedArrayObtainStyledAttributes, index, this.f874u);
                        break;
                    case 11:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f847d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f847d);
                        break;
                    case 18:
                        this.f849e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f849e);
                        break;
                    case 19:
                        this.f851f = typedArrayObtainStyledAttributes.getFloat(index, this.f851f);
                        break;
                    case 20:
                        this.f876w = typedArrayObtainStyledAttributes.getFloat(index, this.f876w);
                        break;
                    case dn.zzm /* 21 */:
                        this.f845c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f845c);
                        break;
                    case 22:
                        this.f843b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f843b);
                        break;
                    case 23:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.h = d.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                    case 25:
                        this.f856i = d.f(typedArrayObtainStyledAttributes, index, this.f856i);
                        break;
                    case 26:
                        this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f858j = d.f(typedArrayObtainStyledAttributes, index, this.f858j);
                        break;
                    case 29:
                        this.f860k = d.f(typedArrayObtainStyledAttributes, index, this.f860k);
                        break;
                    case 30:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.s = d.f(typedArrayObtainStyledAttributes, index, this.s);
                        break;
                    case 32:
                        this.f873t = d.f(typedArrayObtainStyledAttributes, index, this.f873t);
                        break;
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                        this.f864m = d.f(typedArrayObtainStyledAttributes, index, this.f864m);
                        break;
                    case 35:
                        this.f862l = d.f(typedArrayObtainStyledAttributes, index, this.f862l);
                        break;
                    case 36:
                        this.f877x = typedArrayObtainStyledAttributes.getFloat(index, this.f877x);
                        break;
                    case 37:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        d.g(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.g(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i7) {
                            case 61:
                                this.f879z = d.f(typedArrayObtainStyledAttributes, index, this.f879z);
                                break;
                            case 62:
                                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i7) {
                                    case 69:
                                        this.f848d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f850e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f852f0 = typedArrayObtainStyledAttributes.getInt(index, this.f852f0);
                                        break;
                                    case 73:
                                        this.f854g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f854g0);
                                        break;
                                    case 74:
                                        this.f859j0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f867n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f867n0);
                                        break;
                                    case 76:
                                        this.f869o0 = typedArrayObtainStyledAttributes.getInt(index, this.f869o0);
                                        break;
                                    case 77:
                                        this.f871q = d.f(typedArrayObtainStyledAttributes, index, this.f871q);
                                        break;
                                    case 78:
                                        this.f872r = d.f(typedArrayObtainStyledAttributes, index, this.f872r);
                                        break;
                                    case 79:
                                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f842a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f842a0);
                                        break;
                                    case 84:
                                        this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f846c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f846c0);
                                        break;
                                    case 86:
                                        this.f844b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f844b0);
                                        break;
                                    case 87:
                                        this.f863l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f863l0);
                                        break;
                                    case 88:
                                        this.f865m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f865m0);
                                        break;
                                    case 89:
                                        this.f861k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f853g = typedArrayObtainStyledAttributes.getBoolean(index, this.f853g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: j, reason: collision with root package name */
        public static final SparseIntArray f880j;

        /* renamed from: a, reason: collision with root package name */
        public int f881a;

        /* renamed from: b, reason: collision with root package name */
        public int f882b;

        /* renamed from: c, reason: collision with root package name */
        public int f883c;

        /* renamed from: d, reason: collision with root package name */
        public float f884d;

        /* renamed from: e, reason: collision with root package name */
        public float f885e;

        /* renamed from: f, reason: collision with root package name */
        public float f886f;

        /* renamed from: g, reason: collision with root package name */
        public int f887g;
        public String h;

        /* renamed from: i, reason: collision with root package name */
        public int f888i;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f880j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12770g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                switch (f880j.get(index)) {
                    case 1:
                        this.f885e = typedArrayObtainStyledAttributes.getFloat(index, this.f885e);
                        break;
                    case 2:
                        this.f883c = typedArrayObtainStyledAttributes.getInt(index, this.f883c);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = a0.a.f4b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f881a = d.f(typedArrayObtainStyledAttributes, index, this.f881a);
                        break;
                    case 6:
                        this.f882b = typedArrayObtainStyledAttributes.getInteger(index, this.f882b);
                        break;
                    case 7:
                        this.f884d = typedArrayObtainStyledAttributes.getFloat(index, this.f884d);
                        break;
                    case 8:
                        this.f887g = typedArrayObtainStyledAttributes.getInteger(index, this.f887g);
                        break;
                    case 9:
                        this.f886f = typedArrayObtainStyledAttributes.getFloat(index, this.f886f);
                        break;
                    case 10:
                        int i7 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i7 == 1) {
                            this.f888i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else if (i7 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.h = string;
                            if (string.indexOf("/") > 0) {
                                this.f888i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.f888i);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0012d {

        /* renamed from: a, reason: collision with root package name */
        public int f889a;

        /* renamed from: b, reason: collision with root package name */
        public int f890b;

        /* renamed from: c, reason: collision with root package name */
        public float f891c;

        /* renamed from: d, reason: collision with root package name */
        public float f892d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12771i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.f891c = typedArrayObtainStyledAttributes.getFloat(index, this.f891c);
                } else if (index == 0) {
                    int i7 = typedArrayObtainStyledAttributes.getInt(index, this.f889a);
                    this.f889a = i7;
                    this.f889a = d.f818d[i7];
                } else if (index == 4) {
                    this.f890b = typedArrayObtainStyledAttributes.getInt(index, this.f890b);
                } else if (index == 3) {
                    this.f892d = typedArrayObtainStyledAttributes.getFloat(index, this.f892d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f893n;

        /* renamed from: a, reason: collision with root package name */
        public float f894a;

        /* renamed from: b, reason: collision with root package name */
        public float f895b;

        /* renamed from: c, reason: collision with root package name */
        public float f896c;

        /* renamed from: d, reason: collision with root package name */
        public float f897d;

        /* renamed from: e, reason: collision with root package name */
        public float f898e;

        /* renamed from: f, reason: collision with root package name */
        public float f899f;

        /* renamed from: g, reason: collision with root package name */
        public float f900g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public float f901i;

        /* renamed from: j, reason: collision with root package name */
        public float f902j;

        /* renamed from: k, reason: collision with root package name */
        public float f903k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f904l;

        /* renamed from: m, reason: collision with root package name */
        public float f905m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f893n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0.d.f12773k);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                switch (f893n.get(index)) {
                    case 1:
                        this.f894a = typedArrayObtainStyledAttributes.getFloat(index, this.f894a);
                        break;
                    case 2:
                        this.f895b = typedArrayObtainStyledAttributes.getFloat(index, this.f895b);
                        break;
                    case 3:
                        this.f896c = typedArrayObtainStyledAttributes.getFloat(index, this.f896c);
                        break;
                    case 4:
                        this.f897d = typedArrayObtainStyledAttributes.getFloat(index, this.f897d);
                        break;
                    case 5:
                        this.f898e = typedArrayObtainStyledAttributes.getFloat(index, this.f898e);
                        break;
                    case 6:
                        this.f899f = typedArrayObtainStyledAttributes.getDimension(index, this.f899f);
                        break;
                    case 7:
                        this.f900g = typedArrayObtainStyledAttributes.getDimension(index, this.f900g);
                        break;
                    case 8:
                        this.f901i = typedArrayObtainStyledAttributes.getDimension(index, this.f901i);
                        break;
                    case 9:
                        this.f902j = typedArrayObtainStyledAttributes.getDimension(index, this.f902j);
                        break;
                    case 10:
                        this.f903k = typedArrayObtainStyledAttributes.getDimension(index, this.f903k);
                        break;
                    case 11:
                        this.f904l = true;
                        this.f905m = typedArrayObtainStyledAttributes.getDimension(index, this.f905m);
                        break;
                    case 12:
                        this.h = d.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f819e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f820f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(androidx.constraintlayout.widget.a aVar, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < strArrSplit.length) {
            String strTrim = strArrSplit[i6].trim();
            Integer num = null;
            try {
                iIntValue = e0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.E;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.E.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i7] = iIntValue;
            i6++;
            i7++;
        }
        return i7 != strArrSplit.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    public static a d(Context context, AttributeSet attributeSet, boolean z6) {
        int i6;
        boolean z7;
        String str;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6 ? e0.d.f12766c : e0.d.f12764a);
        C0012d c0012d = aVar.f825b;
        e eVar = aVar.f828e;
        c cVar = aVar.f826c;
        b bVar = aVar.f827d;
        int[] iArr = f818d;
        String[] strArr = a0.a.f4b;
        String str2 = "Unknown attribute 0x";
        SparseIntArray sparseIntArray = f819e;
        if (z6) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            a.C0011a c0011a = new a.C0011a();
            cVar.getClass();
            bVar.getClass();
            eVar.getClass();
            int i7 = 0;
            while (i7 < indexCount) {
                int i8 = indexCount;
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i9 = i7;
                switch (f820f.get(index)) {
                    case 2:
                        str = str2;
                        c0011a.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str2);
                        str = str2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        str = str2;
                        c0011a.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        str = str2;
                        c0011a.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.C));
                        break;
                    case 7:
                        str = str2;
                        c0011a.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.D));
                        break;
                    case 8:
                        str = str2;
                        c0011a.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J));
                        break;
                    case 11:
                        str = str2;
                        c0011a.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P));
                        break;
                    case 12:
                        str = str2;
                        c0011a.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q));
                        break;
                    case 13:
                        str = str2;
                        c0011a.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M));
                        break;
                    case 14:
                        str = str2;
                        c0011a.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O));
                        break;
                    case 15:
                        str = str2;
                        c0011a.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R));
                        break;
                    case 16:
                        str = str2;
                        c0011a.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N));
                        break;
                    case 17:
                        str = str2;
                        c0011a.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f847d));
                        break;
                    case 18:
                        str = str2;
                        c0011a.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f849e));
                        break;
                    case 19:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f851f), 19);
                        break;
                    case 20:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f876w), 20);
                        break;
                    case dn.zzm /* 21 */:
                        str = str2;
                        c0011a.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f845c));
                        break;
                    case 22:
                        str = str2;
                        c0011a.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c0012d.f889a)]);
                        break;
                    case 23:
                        str = str2;
                        c0011a.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f843b));
                        break;
                    case 24:
                        str = str2;
                        c0011a.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.F));
                        break;
                    case 27:
                        str = str2;
                        c0011a.b(27, typedArrayObtainStyledAttributes.getInt(index, bVar.E));
                        break;
                    case 28:
                        str = str2;
                        c0011a.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G));
                        break;
                    case 31:
                        str = str2;
                        c0011a.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K));
                        break;
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                        str = str2;
                        c0011a.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H));
                        break;
                    case 37:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f877x), 37);
                        break;
                    case 38:
                        str = str2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f824a);
                        aVar.f824a = resourceId;
                        c0011a.b(38, resourceId);
                        break;
                    case 39:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.U), 39);
                        break;
                    case 40:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.T), 40);
                        break;
                    case 41:
                        str = str2;
                        c0011a.b(41, typedArrayObtainStyledAttributes.getInt(index, bVar.V));
                        break;
                    case 42:
                        str = str2;
                        c0011a.b(42, typedArrayObtainStyledAttributes.getInt(index, bVar.W));
                        break;
                    case 43:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, c0012d.f891c), 43);
                        break;
                    case 44:
                        str = str2;
                        c0011a.d(44, true);
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f905m), 44);
                        break;
                    case 45:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f895b), 45);
                        break;
                    case 46:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f896c), 46);
                        break;
                    case 47:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f897d), 47);
                        break;
                    case 48:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f898e), 48);
                        break;
                    case 49:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f899f), 49);
                        break;
                    case 50:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f900g), 50);
                        break;
                    case 51:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f901i), 51);
                        break;
                    case 52:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f902j), 52);
                        break;
                    case 53:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f903k), 53);
                        break;
                    case 54:
                        str = str2;
                        c0011a.b(54, typedArrayObtainStyledAttributes.getInt(index, bVar.X));
                        break;
                    case 55:
                        str = str2;
                        c0011a.b(55, typedArrayObtainStyledAttributes.getInt(index, bVar.Y));
                        break;
                    case 56:
                        str = str2;
                        c0011a.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Z));
                        break;
                    case 57:
                        str = str2;
                        c0011a.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f842a0));
                        break;
                    case 58:
                        str = str2;
                        c0011a.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f844b0));
                        break;
                    case 59:
                        str = str2;
                        c0011a.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f846c0));
                        break;
                    case 60:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.f894a), 60);
                        break;
                    case 62:
                        str = str2;
                        c0011a.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.A));
                        break;
                    case 63:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.B), 63);
                        break;
                    case 64:
                        str = str2;
                        c0011a.b(64, f(typedArrayObtainStyledAttributes, index, cVar.f881a));
                        break;
                    case 65:
                        str = str2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0011a.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c0011a.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        str = str2;
                        c0011a.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f885e), 67);
                        break;
                    case 68:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, c0012d.f892d), 68);
                        break;
                    case 69:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        str = str2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str2;
                        c0011a.b(72, typedArrayObtainStyledAttributes.getInt(index, bVar.f852f0));
                        break;
                    case 73:
                        str = str2;
                        c0011a.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f854g0));
                        break;
                    case 74:
                        str = str2;
                        c0011a.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str = str2;
                        c0011a.d(75, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f867n0));
                        break;
                    case 76:
                        str = str2;
                        c0011a.b(76, typedArrayObtainStyledAttributes.getInt(index, cVar.f883c));
                        break;
                    case 77:
                        str = str2;
                        c0011a.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        str = str2;
                        c0011a.b(78, typedArrayObtainStyledAttributes.getInt(index, c0012d.f890b));
                        break;
                    case 79:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f884d), 79);
                        break;
                    case 80:
                        str = str2;
                        c0011a.d(80, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f863l0));
                        break;
                    case 81:
                        str = str2;
                        c0011a.d(81, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f865m0));
                        break;
                    case 82:
                        str = str2;
                        c0011a.b(82, typedArrayObtainStyledAttributes.getInteger(index, cVar.f882b));
                        break;
                    case 83:
                        str = str2;
                        c0011a.b(83, f(typedArrayObtainStyledAttributes, index, eVar.h));
                        break;
                    case 84:
                        str = str2;
                        c0011a.b(84, typedArrayObtainStyledAttributes.getInteger(index, cVar.f887g));
                        break;
                    case 85:
                        str = str2;
                        c0011a.a(typedArrayObtainStyledAttributes.getFloat(index, cVar.f886f), 85);
                        break;
                    case 86:
                        str = str2;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i10 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            cVar.f888i = resourceId2;
                            c0011a.b(89, resourceId2);
                            if (cVar.f888i != -1) {
                                c0011a.b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i10 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            cVar.h = string;
                            c0011a.c(90, string);
                            if (cVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f888i = resourceId3;
                                c0011a.b(89, resourceId3);
                                c0011a.b(88, -2);
                                break;
                            } else {
                                c0011a.b(88, -1);
                                break;
                            }
                        } else {
                            c0011a.b(88, typedArrayObtainStyledAttributes.getInteger(index, cVar.f888i));
                            break;
                        }
                    case 87:
                        str = str2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        str = str2;
                        c0011a.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L));
                        break;
                    case 94:
                        str = str2;
                        c0011a.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.S));
                        break;
                    case 95:
                        str = str2;
                        g(c0011a, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        str = str2;
                        g(c0011a, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str = str2;
                        c0011a.b(97, typedArrayObtainStyledAttributes.getInt(index, bVar.f869o0));
                        break;
                    case 98:
                        str = str2;
                        int i11 = d0.d.f12656a0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.f824a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f824a);
                            break;
                        }
                    case 99:
                        str = str2;
                        c0011a.d(99, typedArrayObtainStyledAttributes.getBoolean(index, bVar.f853g));
                        break;
                }
                i7 = i9 + 1;
                indexCount = i8;
                str2 = str;
            }
        } else {
            int i12 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount2; indexCount2 = i6) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        bVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i6 = indexCount2;
                        bVar.f870p = f(typedArrayObtainStyledAttributes, index2, bVar.f870p);
                        break;
                    case 2:
                        i6 = indexCount2;
                        bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.I);
                        break;
                    case 3:
                        i6 = indexCount2;
                        bVar.f868o = f(typedArrayObtainStyledAttributes, index2, bVar.f868o);
                        break;
                    case 4:
                        i6 = indexCount2;
                        bVar.f866n = f(typedArrayObtainStyledAttributes, index2, bVar.f866n);
                        break;
                    case 5:
                        i6 = indexCount2;
                        bVar.f878y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        i6 = indexCount2;
                        bVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.C);
                        break;
                    case 7:
                        i6 = indexCount2;
                        bVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.D);
                        break;
                    case 8:
                        i6 = indexCount2;
                        bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.J);
                        break;
                    case 9:
                        i6 = indexCount2;
                        bVar.f875v = f(typedArrayObtainStyledAttributes, index2, bVar.f875v);
                        break;
                    case 10:
                        i6 = indexCount2;
                        bVar.f874u = f(typedArrayObtainStyledAttributes, index2, bVar.f874u);
                        break;
                    case 11:
                        i6 = indexCount2;
                        bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.P);
                        break;
                    case 12:
                        i6 = indexCount2;
                        bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Q);
                        break;
                    case 13:
                        i6 = indexCount2;
                        bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.M);
                        break;
                    case 14:
                        i6 = indexCount2;
                        bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.O);
                        break;
                    case 15:
                        i6 = indexCount2;
                        bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.R);
                        break;
                    case 16:
                        i6 = indexCount2;
                        bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.N);
                        break;
                    case 17:
                        i6 = indexCount2;
                        bVar.f847d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f847d);
                        break;
                    case 18:
                        i6 = indexCount2;
                        bVar.f849e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f849e);
                        break;
                    case 19:
                        i6 = indexCount2;
                        bVar.f851f = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f851f);
                        break;
                    case 20:
                        i6 = indexCount2;
                        bVar.f876w = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f876w);
                        break;
                    case dn.zzm /* 21 */:
                        i6 = indexCount2;
                        bVar.f845c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.f845c);
                        break;
                    case 22:
                        i6 = indexCount2;
                        int i13 = typedArrayObtainStyledAttributes.getInt(index2, c0012d.f889a);
                        c0012d.f889a = i13;
                        c0012d.f889a = iArr[i13];
                        break;
                    case 23:
                        i6 = indexCount2;
                        bVar.f843b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.f843b);
                        break;
                    case 24:
                        i6 = indexCount2;
                        bVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.F);
                        break;
                    case 25:
                        i6 = indexCount2;
                        bVar.h = f(typedArrayObtainStyledAttributes, index2, bVar.h);
                        break;
                    case 26:
                        i6 = indexCount2;
                        bVar.f856i = f(typedArrayObtainStyledAttributes, index2, bVar.f856i);
                        break;
                    case 27:
                        i6 = indexCount2;
                        bVar.E = typedArrayObtainStyledAttributes.getInt(index2, bVar.E);
                        break;
                    case 28:
                        i6 = indexCount2;
                        bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.G);
                        break;
                    case 29:
                        i6 = indexCount2;
                        bVar.f858j = f(typedArrayObtainStyledAttributes, index2, bVar.f858j);
                        break;
                    case 30:
                        i6 = indexCount2;
                        bVar.f860k = f(typedArrayObtainStyledAttributes, index2, bVar.f860k);
                        break;
                    case 31:
                        i6 = indexCount2;
                        bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.K);
                        break;
                    case 32:
                        i6 = indexCount2;
                        bVar.s = f(typedArrayObtainStyledAttributes, index2, bVar.s);
                        break;
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                        i6 = indexCount2;
                        bVar.f873t = f(typedArrayObtainStyledAttributes, index2, bVar.f873t);
                        break;
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                        i6 = indexCount2;
                        bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.H);
                        break;
                    case 35:
                        i6 = indexCount2;
                        bVar.f864m = f(typedArrayObtainStyledAttributes, index2, bVar.f864m);
                        break;
                    case 36:
                        i6 = indexCount2;
                        bVar.f862l = f(typedArrayObtainStyledAttributes, index2, bVar.f862l);
                        break;
                    case 37:
                        i6 = indexCount2;
                        bVar.f877x = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f877x);
                        break;
                    case 38:
                        i6 = indexCount2;
                        aVar.f824a = typedArrayObtainStyledAttributes.getResourceId(index2, aVar.f824a);
                        break;
                    case 39:
                        i6 = indexCount2;
                        bVar.U = typedArrayObtainStyledAttributes.getFloat(index2, bVar.U);
                        break;
                    case 40:
                        i6 = indexCount2;
                        bVar.T = typedArrayObtainStyledAttributes.getFloat(index2, bVar.T);
                        break;
                    case 41:
                        i6 = indexCount2;
                        bVar.V = typedArrayObtainStyledAttributes.getInt(index2, bVar.V);
                        break;
                    case 42:
                        i6 = indexCount2;
                        bVar.W = typedArrayObtainStyledAttributes.getInt(index2, bVar.W);
                        break;
                    case 43:
                        i6 = indexCount2;
                        c0012d.f891c = typedArrayObtainStyledAttributes.getFloat(index2, c0012d.f891c);
                        break;
                    case 44:
                        i6 = indexCount2;
                        eVar.f904l = true;
                        eVar.f905m = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f905m);
                        break;
                    case 45:
                        i6 = indexCount2;
                        eVar.f895b = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f895b);
                        break;
                    case 46:
                        i6 = indexCount2;
                        eVar.f896c = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f896c);
                        break;
                    case 47:
                        i6 = indexCount2;
                        eVar.f897d = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f897d);
                        break;
                    case 48:
                        i6 = indexCount2;
                        eVar.f898e = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f898e);
                        break;
                    case 49:
                        i6 = indexCount2;
                        eVar.f899f = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f899f);
                        break;
                    case 50:
                        i6 = indexCount2;
                        eVar.f900g = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f900g);
                        break;
                    case 51:
                        i6 = indexCount2;
                        eVar.f901i = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f901i);
                        break;
                    case 52:
                        i6 = indexCount2;
                        eVar.f902j = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f902j);
                        break;
                    case 53:
                        i6 = indexCount2;
                        eVar.f903k = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f903k);
                        break;
                    case 54:
                        i6 = indexCount2;
                        bVar.X = typedArrayObtainStyledAttributes.getInt(index2, bVar.X);
                        break;
                    case 55:
                        i6 = indexCount2;
                        bVar.Y = typedArrayObtainStyledAttributes.getInt(index2, bVar.Y);
                        break;
                    case 56:
                        i6 = indexCount2;
                        bVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Z);
                        break;
                    case 57:
                        i6 = indexCount2;
                        bVar.f842a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f842a0);
                        break;
                    case 58:
                        i6 = indexCount2;
                        bVar.f844b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f844b0);
                        break;
                    case 59:
                        i6 = indexCount2;
                        bVar.f846c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f846c0);
                        break;
                    case 60:
                        i6 = indexCount2;
                        eVar.f894a = typedArrayObtainStyledAttributes.getFloat(index2, eVar.f894a);
                        break;
                    case 61:
                        i6 = indexCount2;
                        bVar.f879z = f(typedArrayObtainStyledAttributes, index2, bVar.f879z);
                        break;
                    case 62:
                        i6 = indexCount2;
                        bVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.A);
                        break;
                    case 63:
                        i6 = indexCount2;
                        bVar.B = typedArrayObtainStyledAttributes.getFloat(index2, bVar.B);
                        break;
                    case 64:
                        i6 = indexCount2;
                        cVar.f881a = f(typedArrayObtainStyledAttributes, index2, cVar.f881a);
                        break;
                    case 65:
                        i6 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            cVar.getClass();
                            break;
                        } else {
                            String str3 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            cVar.getClass();
                            break;
                        }
                    case 66:
                        i6 = indexCount2;
                        z7 = false;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        break;
                    case 67:
                        i6 = indexCount2;
                        cVar.f885e = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f885e);
                        break;
                    case 68:
                        i6 = indexCount2;
                        c0012d.f892d = typedArrayObtainStyledAttributes.getFloat(index2, c0012d.f892d);
                        break;
                    case 69:
                        i6 = indexCount2;
                        bVar.f848d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i6 = indexCount2;
                        bVar.f850e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i6 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i6 = indexCount2;
                        bVar.f852f0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.f852f0);
                        break;
                    case 73:
                        i6 = indexCount2;
                        bVar.f854g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f854g0);
                        break;
                    case 74:
                        i6 = indexCount2;
                        bVar.f859j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i6 = indexCount2;
                        bVar.f867n0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f867n0);
                        break;
                    case 76:
                        i6 = indexCount2;
                        cVar.f883c = typedArrayObtainStyledAttributes.getInt(index2, cVar.f883c);
                        break;
                    case 77:
                        i6 = indexCount2;
                        bVar.f861k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i6 = indexCount2;
                        c0012d.f890b = typedArrayObtainStyledAttributes.getInt(index2, c0012d.f890b);
                        break;
                    case 79:
                        i6 = indexCount2;
                        cVar.f884d = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f884d);
                        break;
                    case 80:
                        i6 = indexCount2;
                        bVar.f863l0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f863l0);
                        break;
                    case 81:
                        i6 = indexCount2;
                        bVar.f865m0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.f865m0);
                        break;
                    case 82:
                        i6 = indexCount2;
                        cVar.f882b = typedArrayObtainStyledAttributes.getInteger(index2, cVar.f882b);
                        break;
                    case 83:
                        i6 = indexCount2;
                        eVar.h = f(typedArrayObtainStyledAttributes, index2, eVar.h);
                        break;
                    case 84:
                        i6 = indexCount2;
                        cVar.f887g = typedArrayObtainStyledAttributes.getInteger(index2, cVar.f887g);
                        break;
                    case 85:
                        i6 = indexCount2;
                        cVar.f886f = typedArrayObtainStyledAttributes.getFloat(index2, cVar.f886f);
                        break;
                    case 86:
                        i6 = indexCount2;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i14 == 1) {
                            cVar.f888i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i14 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            cVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                cVar.f888i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, cVar.f888i);
                        }
                        break;
                    case 87:
                        i6 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        i6 = indexCount2;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        i6 = indexCount2;
                        bVar.f871q = f(typedArrayObtainStyledAttributes, index2, bVar.f871q);
                        break;
                    case 92:
                        i6 = indexCount2;
                        bVar.f872r = f(typedArrayObtainStyledAttributes, index2, bVar.f872r);
                        break;
                    case 93:
                        i6 = indexCount2;
                        bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.L);
                        break;
                    case 94:
                        i6 = indexCount2;
                        bVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.S);
                        break;
                    case 95:
                        i6 = indexCount2;
                        z7 = false;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        i6 = indexCount2;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i6 = indexCount2;
                        bVar.f869o0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.f869o0);
                        break;
                }
                i12++;
            }
            if (bVar.f859j0 != null) {
                bVar.f857i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int f(TypedArray typedArray, int i6, int i7) {
        int resourceId = typedArray.getResourceId(i6, i7);
        return resourceId == -1 ? typedArray.getInt(i6, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i6, int i7) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i8 = typedArray.peekValue(i6).type;
        boolean z6 = true;
        int i9 = 0;
        if (i8 == 3) {
            String string = typedArray.getString(i6);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar = (ConstraintLayout.a) obj;
                        if (i7 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar).height = 0;
                        }
                        h(aVar, strTrim2);
                        return;
                    }
                    if (obj instanceof b) {
                        ((b) obj).f878y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof a.C0011a) {
                            ((a.C0011a) obj).c(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f6 = Float.parseFloat(strTrim2);
                        if (obj instanceof ConstraintLayout.a) {
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                            if (i7 == 0) {
                                ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                                aVar2.H = f6;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                                aVar2.I = f6;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (i7 == 0) {
                                bVar.f843b = 0;
                                bVar.U = f6;
                                return;
                            } else {
                                bVar.f845c = 0;
                                bVar.T = f6;
                                return;
                            }
                        }
                        if (obj instanceof a.C0011a) {
                            a.C0011a c0011a = (a.C0011a) obj;
                            if (i7 == 0) {
                                c0011a.b(23, 0);
                                c0011a.a(f6, 39);
                                return;
                            } else {
                                c0011a.b(21, 0);
                                c0011a.a(f6, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof ConstraintLayout.a) {
                            ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                            if (i7 == 0) {
                                ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                                aVar3.R = fMax;
                                aVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                                aVar3.S = fMax;
                                aVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar2 = (b) obj;
                            if (i7 == 0) {
                                bVar2.f843b = 0;
                                bVar2.f848d0 = fMax;
                                bVar2.X = 2;
                                return;
                            } else {
                                bVar2.f845c = 0;
                                bVar2.f850e0 = fMax;
                                bVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof a.C0011a) {
                            a.C0011a c0011a2 = (a.C0011a) obj;
                            if (i7 == 0) {
                                c0011a2.b(23, 0);
                                c0011a2.b(54, 2);
                                return;
                            } else {
                                c0011a2.b(21, 0);
                                c0011a2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i8 != 5) {
            dimensionPixelSize = typedArray.getInt(i6, 0);
            if (dimensionPixelSize == -4) {
                i9 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z6 = false;
            }
            if (!(obj instanceof ConstraintLayout.a)) {
                ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                if (i7 == 0) {
                    ((ViewGroup.MarginLayoutParams) aVar4).width = i9;
                    aVar4.W = z6;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) aVar4).height = i9;
                    aVar4.X = z6;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar3 = (b) obj;
                if (i7 == 0) {
                    bVar3.f843b = i9;
                    bVar3.f863l0 = z6;
                    return;
                } else {
                    bVar3.f845c = i9;
                    bVar3.f865m0 = z6;
                    return;
                }
            }
            if (obj instanceof a.C0011a) {
                a.C0011a c0011a3 = (a.C0011a) obj;
                if (i7 == 0) {
                    c0011a3.b(23, i9);
                    c0011a3.d(80, z6);
                    return;
                } else {
                    c0011a3.b(21, i9);
                    c0011a3.d(81, z6);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i6, 0);
        z6 = false;
        i9 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.a)) {
        }
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i6 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i6 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f6 = Float.parseFloat(strSubstring3);
                        float f7 = Float.parseFloat(strSubstring4);
                        if (f6 > 0.0f && f7 > 0.0f) {
                            if (i6 == 1) {
                                Math.abs(f7 / f6);
                            } else {
                                Math.abs(f6 / f7);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i6;
        HashMap<String, androidx.constraintlayout.widget.b> map;
        String resourceEntryName;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = dVar.f823c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (dVar.f822b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        a aVar = map2.get(Integer.valueOf(id));
                        if (aVar != null) {
                            C0012d c0012d = aVar.f825b;
                            b bVar = aVar.f827d;
                            e eVar = aVar.f828e;
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                bVar.f855h0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(bVar.f852f0);
                                aVar2.setMargin(bVar.f854g0);
                                aVar2.setAllowsGoneWidget(bVar.f867n0);
                                int[] iArr = bVar.f857i0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f859j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar2, str);
                                        bVar.f857i0 = iArrC;
                                        aVar2.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar3.a();
                            aVar.a(aVar3);
                            HashMap<String, androidx.constraintlayout.widget.b> map3 = aVar.f829f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                androidx.constraintlayout.widget.b bVar2 = map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strA = !bVar2.f797a ? k0.a("set", str2) : str2;
                                int i8 = i7;
                                try {
                                    int iOrdinal = bVar2.f799c.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(bVar2.f800d));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strA, cls2).invoke(childAt, Float.valueOf(bVar2.f801e));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(bVar2.h));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strA, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar2.h);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i7 = i8;
                                                map3 = map;
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strA, e);
                                                hashSet2 = hashSet3;
                                                i7 = i8;
                                                map3 = map;
                                            } catch (InvocationTargetException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i7 = i8;
                                                map3 = map;
                                            }
                                        case 4:
                                            cls.getMethod(strA, CharSequence.class).invoke(childAt, bVar2.f802f);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strA, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar2.f803g));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strA, cls2).invoke(childAt, Float.valueOf(bVar2.f801e));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(bVar2.f800d));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e9) {
                                    e = e9;
                                    map = map3;
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                    map = map3;
                                } catch (InvocationTargetException e11) {
                                    e = e11;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i7 = i8;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i6 = i7;
                            childAt.setLayoutParams(aVar3);
                            if (c0012d.f890b == 0) {
                                childAt.setVisibility(c0012d.f889a);
                            }
                            childAt.setAlpha(c0012d.f891c);
                            childAt.setRotation(eVar.f894a);
                            childAt.setRotationX(eVar.f895b);
                            childAt.setRotationY(eVar.f896c);
                            childAt.setScaleX(eVar.f897d);
                            childAt.setScaleY(eVar.f898e);
                            if (eVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f899f)) {
                                    childAt.setPivotX(eVar.f899f);
                                }
                                if (!Float.isNaN(eVar.f900g)) {
                                    childAt.setPivotY(eVar.f900g);
                                }
                            }
                            childAt.setTranslationX(eVar.f901i);
                            childAt.setTranslationY(eVar.f902j);
                            childAt.setTranslationZ(eVar.f903k);
                            if (eVar.f904l) {
                                childAt.setElevation(eVar.f905m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i6 = i7;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i7 = i6 + 1;
                dVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i6 = i7;
            i7 = i6 + 1;
            dVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar4 = map2.get(num);
            if (aVar4 != null) {
                b bVar3 = aVar4.f827d;
                if (bVar3.f855h0 == 1) {
                    Context context = constraintLayout.getContext();
                    androidx.constraintlayout.widget.a aVar5 = new androidx.constraintlayout.widget.a(context);
                    aVar5.s = new int[32];
                    aVar5.f816y = null;
                    aVar5.f817z = new HashMap<>();
                    aVar5.f812u = context;
                    aVar5.g(null);
                    aVar5.setVisibility(8);
                    aVar5.setId(num.intValue());
                    int[] iArr2 = bVar3.f857i0;
                    if (iArr2 != null) {
                        aVar5.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar3.f859j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar5, str3);
                            bVar3.f857i0 = iArrC2;
                            aVar5.setReferencedIds(iArrC2);
                        }
                    }
                    aVar5.setType(bVar3.f852f0);
                    aVar5.setMargin(bVar3.f854g0);
                    e0.e eVar2 = ConstraintLayout.H;
                    ConstraintLayout.a aVar6 = new ConstraintLayout.a();
                    aVar5.i();
                    aVar4.a(aVar6);
                    constraintLayout.addView(aVar5, aVar6);
                }
                if (bVar3.f841a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e0.e eVar3 = ConstraintLayout.H;
                    ConstraintLayout.a aVar7 = new ConstraintLayout.a();
                    aVar4.a(aVar7);
                    constraintLayout.addView(guideline, aVar7);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i6;
        HashMap<Integer, a> map;
        int i7;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = dVar.f823c;
        map2.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dVar.f822b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new a());
            }
            a aVar2 = map2.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i6 = childCount;
                map = map2;
                i7 = i8;
            } else {
                C0012d c0012d = aVar2.f825b;
                b bVar = aVar2.f827d;
                e eVar = aVar2.f828e;
                i6 = childCount;
                HashMap<String, androidx.constraintlayout.widget.b> map3 = new HashMap<>();
                map = map2;
                Class<?> cls = childAt.getClass();
                i7 = i8;
                HashMap<String, androidx.constraintlayout.widget.b> map4 = dVar.f821a;
                for (String str : map4.keySet()) {
                    androidx.constraintlayout.widget.b bVar2 = map4.get(str);
                    HashMap<String, androidx.constraintlayout.widget.b> map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new androidx.constraintlayout.widget.b(bVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new androidx.constraintlayout.widget.b(bVar2, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e6) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e6);
                    } catch (NoSuchMethodException e7) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e7);
                    } catch (InvocationTargetException e8) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e8);
                    }
                    map4 = map5;
                }
                aVar2.f829f = map3;
                aVar2.b(id, aVar);
                c0012d.f889a = childAt.getVisibility();
                c0012d.f891c = childAt.getAlpha();
                eVar.f894a = childAt.getRotation();
                eVar.f895b = childAt.getRotationX();
                eVar.f896c = childAt.getRotationY();
                eVar.f897d = childAt.getScaleX();
                eVar.f898e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f899f = pivotX;
                    eVar.f900g = pivotY;
                }
                eVar.f901i = childAt.getTranslationX();
                eVar.f902j = childAt.getTranslationY();
                eVar.f903k = childAt.getTranslationZ();
                if (eVar.f904l) {
                    eVar.f905m = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    bVar.f867n0 = aVar3.getAllowsGoneWidget();
                    bVar.f857i0 = aVar3.getReferencedIds();
                    bVar.f852f0 = aVar3.getType();
                    bVar.f854g0 = aVar3.getMargin();
                }
            }
            i8 = i7 + 1;
            dVar = this;
            childCount = i6;
            map2 = map;
        }
    }

    public final void e(Context context, int i6) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarD.f827d.f841a = true;
                    }
                    this.f823c.put(Integer.valueOf(aVarD.f824a), aVarD);
                }
            }
        } catch (IOException e6) {
            Log.e("ConstraintSet", "Error parsing resource: " + i6, e6);
        } catch (XmlPullParserException e7) {
            Log.e("ConstraintSet", "Error parsing resource: " + i6, e7);
        }
    }
}
