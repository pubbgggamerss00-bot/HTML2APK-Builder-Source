package w1;

import android.graphics.Bitmap;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.b0;
import q1.b1;
import q1.c1;
import q1.e0;
import q1.p0;
import q1.w0;
import s1.a;
import t.r;
import x0.x1;

/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: b, reason: collision with root package name */
    public final w1.c f31184b;

    /* renamed from: c, reason: collision with root package name */
    public String f31185c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31186d;

    /* renamed from: e, reason: collision with root package name */
    public final w1.a f31187e;

    /* renamed from: f, reason: collision with root package name */
    public eh.a<f0> f31188f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f31189g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f31190h;

    /* renamed from: i, reason: collision with root package name */
    public final x1 f31191i;

    /* renamed from: j, reason: collision with root package name */
    public long f31192j;

    /* renamed from: k, reason: collision with root package name */
    public float f31193k;

    /* renamed from: l, reason: collision with root package name */
    public float f31194l;

    /* renamed from: m, reason: collision with root package name */
    public final b f31195m;

    public static final class a extends s implements eh.l<j, f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(j jVar) {
            k kVar = k.this;
            kVar.f31186d = true;
            kVar.f31188f.invoke();
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.l<s1.e, f0> {
        public b() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            k kVar = k.this;
            w1.c cVar = kVar.f31184b;
            float f10 = kVar.f31193k;
            float f11 = kVar.f31194l;
            a.b bVarQ0 = eVar2.Q0();
            long jD = bVarQ0.d();
            bVarQ0.a().d();
            try {
                bVarQ0.f24180a.e(f10, f11, 0L);
                cVar.a(eVar2);
                r.a(bVarQ0, jD);
                return f0.f21461a;
            } catch (Throwable th2) {
                r.a(bVarQ0, jD);
                throw th2;
            }
        }
    }

    public static final class c extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31198a = new c(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ f0 invoke() {
            return f0.f21461a;
        }
    }

    public k(w1.c cVar) {
        this.f31184b = cVar;
        cVar.f31055i = new a();
        this.f31185c = "";
        this.f31186d = true;
        this.f31187e = new w1.a();
        this.f31188f = c.f31198a;
        this.f31189g = bg.b.h(null);
        this.f31191i = bg.b.h(new p1.h(0L));
        this.f31192j = 9205357640488583168L;
        this.f31193k = 1.0f;
        this.f31194l = 1.0f;
        this.f31195m = new b();
    }

    @Override // w1.j
    public final void a(s1.e eVar) {
        e(eVar, 1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(s1.e eVar, float f10, c1 c1Var) {
        int i10;
        b0 b0VarA;
        int i11;
        int i12;
        c1 c1Var2 = c1Var;
        w1.c cVar = this.f31184b;
        boolean z10 = cVar.f31050d;
        x1 x1Var = this.f31189g;
        if (!z10 || cVar.f31051e == 16) {
            i10 = 0;
        } else {
            c1 c1Var3 = (c1) x1Var.getValue();
            int i13 = m.f31210a;
            if (!(c1Var3 instanceof p0) ? c1Var3 == null : !((i12 = ((p0) c1Var3).f21724c) != 5 && i12 != 3)) {
                if (!(c1Var2 instanceof p0) ? c1Var2 == null : !((i11 = ((p0) c1Var2).f21724c) != 5 && i11 != 3)) {
                    i10 = 1;
                }
            }
        }
        boolean z11 = this.f31186d;
        w1.a aVar = this.f31187e;
        if (z11 || !p1.h.a(this.f31192j, eVar.i())) {
            this.f31190h = i10 == 1 ? new p0(5, cVar.f31051e) : null;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.i() >> 32));
            x1 x1Var2 = this.f31191i;
            this.f31193k = fIntBitsToFloat / Float.intBitsToFloat((int) (((p1.h) x1Var2.getValue()).f21143a >> 32));
            this.f31194l = Float.intBitsToFloat((int) (eVar.i() & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (((p1.h) x1Var2.getValue()).f21143a & BodyPartID.bodyIdMax));
            long jCeil = (((int) Math.ceil(Float.intBitsToFloat((int) (eVar.i() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (eVar.i() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax);
            f3.r layoutDirection = eVar.getLayoutDirection();
            aVar.f31042c = eVar;
            e0 e0VarA = aVar.f31040a;
            b0 b0Var = aVar.f31041b;
            if (e0VarA != null) {
                Bitmap bitmap = e0VarA.f21686a;
                if (b0Var == null || ((int) (jCeil >> 32)) > bitmap.getWidth() || ((int) (jCeil & BodyPartID.bodyIdMax)) > bitmap.getHeight() || aVar.f31044e != i10) {
                    e0VarA = ya.b.a((int) (jCeil >> 32), (int) (jCeil & BodyPartID.bodyIdMax), i10, 24);
                    b0VarA = com.google.android.gms.common.api.internal.a.a(e0VarA);
                    aVar.f31040a = e0VarA;
                    aVar.f31041b = b0VarA;
                    aVar.f31044e = i10;
                } else {
                    b0VarA = b0Var;
                }
                aVar.f31043d = jCeil;
                s1.a aVar2 = aVar.f31045f;
                long jE = f3.q.e(jCeil);
                a.C0270a c0270a = aVar2.f24172a;
                f3.d dVar = c0270a.f24176a;
                f3.r rVar = c0270a.f24177b;
                w0 w0Var = c0270a.f24178c;
                long j10 = c0270a.f24179d;
                c0270a.f24176a = eVar;
                c0270a.f24177b = layoutDirection;
                c0270a.f24178c = b0VarA;
                c0270a.f24179d = jE;
                b0VarA.d();
                s1.e.X0(aVar2, b1.f21648b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 62);
                this.f31195m.invoke(aVar2);
                b0VarA.o();
                a.C0270a c0270a2 = aVar2.f24172a;
                c0270a2.f24176a = dVar;
                c0270a2.f24177b = rVar;
                c0270a2.f24178c = w0Var;
                c0270a2.f24179d = j10;
                e0VarA.c();
                this.f31186d = false;
                this.f31192j = eVar.i();
            }
        } else {
            e0 e0Var = aVar.f31040a;
            if (i10 != (e0Var != null ? e0Var.b() : 0)) {
            }
        }
        if (c1Var2 == null) {
            c1Var2 = ((c1) x1Var.getValue()) != null ? (c1) x1Var.getValue() : this.f31190h;
        }
        c1 c1Var4 = c1Var2;
        e0 e0Var2 = aVar.f31040a;
        if (e0Var2 == null) {
            f2.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        s1.e.e1(eVar, e0Var2, 0L, aVar.f31043d, 0L, 0L, f10, null, c1Var4, 0, 0, 858);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f31185c);
        sb.append("\n\tviewportWidth: ");
        x1 x1Var = this.f31191i;
        sb.append(Float.intBitsToFloat((int) (((p1.h) x1Var.getValue()).f21143a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((p1.h) x1Var.getValue()).f21143a & BodyPartID.bodyIdMax)));
        sb.append("\n");
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
