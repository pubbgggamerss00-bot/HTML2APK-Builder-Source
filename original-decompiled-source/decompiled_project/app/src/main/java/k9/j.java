package k9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import e9.x0;
import f9.n5;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import pg.l;
import q1.b1;
import t0.e2;
import t0.f2;
import x0.h2;
import x0.j;
import x0.l0;
import x0.o0;
import x0.y;
import y3.a2;
import y3.d2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f16217a;

    /* renamed from: b, reason: collision with root package name */
    public static final e2 f16218b;

    /* renamed from: c, reason: collision with root package name */
    public static final e2 f16219c;

    /* renamed from: d, reason: collision with root package name */
    public static final e2 f16220d;

    /* renamed from: e, reason: collision with root package name */
    public static final e2 f16221e;

    /* renamed from: f, reason: collision with root package name */
    public static final e2 f16222f;

    /* renamed from: g, reason: collision with root package name */
    public static final e2 f16223g;

    static {
        long j10 = d.f16193o;
        long j11 = d.f16194p;
        long j12 = d.f16195q;
        long j13 = d.f16196r;
        long j14 = d.f16197s;
        long j15 = d.f16198t;
        long j16 = d.f16199u;
        long j17 = d.f16200v;
        long j18 = d.f16201w;
        long j19 = d.f16202x;
        long j20 = d.f16203y;
        long j21 = d.f16204z;
        long j22 = d.A;
        long j23 = d.B;
        long j24 = d.C;
        long j25 = d.D;
        long j26 = d.E;
        long j27 = d.F;
        long j28 = d.G;
        long j29 = d.H;
        long j30 = d.I;
        long j31 = d.J;
        long j32 = d.K;
        long j33 = d.M;
        long j34 = d.N;
        long j35 = d.O;
        long j36 = d.P;
        long j37 = d.L;
        long j38 = d.Q;
        f2.c(j10, j11, j12, j13, j35, j14, j15, j16, j17, j18, j19, j20, j21, j26, j27, j28, j29, j30, j31, j36, j34, j33, j22, j24, j23, j25, j32, j37, j38, d.S, d.T, d.R);
        long jC = n0.c(4278355143L);
        long j39 = b1.f21650d;
        long jC2 = n0.c(4292932350L);
        long jC3 = n0.c(4278413729L);
        long jC4 = n0.c(4278355143L);
        long jC5 = n0.c(4292932350L);
        long jC6 = n0.c(4278413729L);
        long jC7 = n0.c(4278413729L);
        long jC8 = n0.c(4290438909L);
        long jC9 = n0.c(4278995566L);
        long j40 = d.W;
        long j41 = d.X;
        long j42 = d.Y;
        long j43 = d.Z;
        long jC10 = n0.c(4294507260L);
        long j44 = d.U;
        long jC11 = n0.c(BodyPartID.bodyIdMax);
        long jC12 = n0.c(4294047225L);
        long j45 = d.V;
        long jC13 = n0.c(4291548641L);
        long jC14 = n0.c(4281413683L);
        f16217a = f2.f(jC, j39, jC2, jC3, n0.c(4281908728L), jC4, j39, jC5, jC6, jC7, j39, jC8, jC9, jC10, j44, jC11, j44, jC12, j45, n0.c(4278355143L), jC14, j44, j40, j42, j41, j43, jC13, n0.c(4293060848L), n0.c(3422552064L), n0.c(4294047225L), n0.c(4293060848L), n0.c(BodyPartID.bodyIdMax), 1610612736, 12);
        long jC15 = n0.c(4281908728L);
        long jC16 = n0.c(4279179050L);
        long jB = n0.b(855803079);
        long jC17 = n0.c(4290438909L);
        long jC18 = n0.c(4281908728L);
        long jC19 = n0.c(4279179050L);
        long jB2 = n0.b(855803079);
        long jC20 = n0.c(4290438909L);
        long jC21 = n0.c(4286436348L);
        long jC22 = n0.c(4279179050L);
        long jB3 = n0.b(641252856);
        long jC23 = n0.c(4292932350L);
        long jC24 = n0.c(4278190080L);
        long j46 = d.f16184f;
        long j47 = d.f16179a;
        long j48 = d.f16181c;
        f16218b = f2.c(jC15, jC16, jB, jC17, n0.c(4278355143L), jC18, jC19, jB2, jC20, jC21, jC22, jB3, jC23, jC24, j46, j47, j46, j48, d.f16185g, n0.c(4281908728L), j46, j47, j22, j24, j23, j25, d.f16182d, d.f16183e, j38, d.f16180b, j48, j47);
        long jC25 = n0.c(4278356177L);
        long jC26 = n0.c(4292998654L);
        long jC27 = n0.c(4278278043L);
        long jC28 = n0.c(4278234305L);
        long jC29 = n0.c(4292933626L);
        long jC30 = n0.c(4278214756L);
        long jC31 = n0.c(4282339765L);
        long jC32 = n0.c(4293454582L);
        long jC33 = n0.c(4279903102L);
        long jC34 = n0.c(4290386458L);
        long jC35 = n0.c(4294957782L);
        long jC36 = n0.c(4282449922L);
        long jC37 = n0.c(4292932350L);
        long jC38 = n0.c(4279770144L);
        long jC39 = n0.c(BodyPartID.bodyIdMax);
        long jC40 = n0.c(4279770144L);
        long jC41 = n0.c(4290438909L);
        long jC42 = n0.c(4282468429L);
        long jC43 = n0.c(4285626494L);
        long jC44 = n0.c(4290889934L);
        long jC45 = n0.c(4293980660L);
        long jC46 = n0.c(4281217332L);
        f16219c = f2.f(jC25, j39, jC26, jC27, n0.c(4286698746L), jC28, j39, jC29, jC30, jC31, j39, jC32, jC33, jC37, jC38, jC39, jC40, jC41, jC42, n0.c(4278356177L), jC46, jC45, jC34, j39, jC35, jC36, jC43, jC44, n0.b(1711276032), n0.c(4290438909L), n0.c(4286436348L), n0.c(BodyPartID.bodyIdMax), 1610612736, 12);
        long jC47 = n0.c(4292352864L);
        long jC48 = n0.c(4294491088L);
        long jC49 = n0.c(4287106639L);
        long jC50 = n0.c(4289533015L);
        long jC51 = n0.c(4294763756L);
        long jC52 = n0.c(4283039795L);
        long jC53 = n0.c(4290910299L);
        long jC54 = n0.c(4294491088L);
        long jC55 = n0.c(4284219440L);
        long jC56 = n0.c(4290386458L);
        long jC57 = n0.c(4294957782L);
        long jC58 = n0.c(4282449922L);
        long jC59 = n0.c(4294763756L);
        long jC60 = n0.c(4280293916L);
        long jC61 = n0.c(BodyPartID.bodyIdMax);
        long jC62 = n0.c(4280293916L);
        long jC63 = n0.c(4294491088L);
        long jC64 = n0.c(4283384647L);
        long jC65 = n0.c(4292119455L);
        long jC66 = n0.c(4293971158L);
        long jC67 = n0.c(4294373361L);
        long jC68 = n0.c(4281543984L);
        f16220d = f2.f(jC47, j39, jC48, jC49, n0.c(4294934699L), jC50, j39, jC51, jC52, jC53, j39, jC54, jC55, jC59, jC60, jC61, jC62, jC63, jC64, n0.c(4292352864L), jC68, jC67, jC56, j39, jC57, jC58, jC65, jC66, n0.b(1711276032), n0.c(4294491088L), n0.c(4294217649L), n0.c(BodyPartID.bodyIdMax), 1610612736, 12);
        long jC69 = n0.c(4278556265L);
        long jC70 = n0.c(4291951333L);
        long jC71 = n0.c(4278603323L);
        long jC72 = n0.c(4279080072L);
        long jC73 = n0.c(4291623921L);
        long jC74 = n0.c(4279455306L);
        long jC75 = n0.c(4279673674L);
        long jC76 = n0.c(4292672743L);
        long jC77 = n0.c(4279522093L);
        long jC78 = n0.c(4290386458L);
        long jC79 = n0.c(4294957782L);
        long jC80 = n0.c(4282449922L);
        long jC81 = n0.c(4293457385L);
        long jC82 = n0.c(4279770394L);
        long jC83 = n0.c(BodyPartID.bodyIdMax);
        long jC84 = n0.c(4279770394L);
        long jC85 = n0.c(4291356361L);
        long jC86 = n0.c(4282338116L);
        long jC87 = n0.c(4286695300L);
        long jC88 = n0.c(4289058471L);
        long jC89 = n0.c(4293784302L);
        long jC90 = n0.c(4281020718L);
        f16221e = f2.f(jC69, j39, jC70, jC71, n0.c(4285458359L), jC72, j39, jC73, jC74, jC75, j39, jC76, jC77, jC81, jC82, jC83, jC84, jC85, jC86, n0.c(4278556265L), jC90, jC89, jC78, j39, jC79, jC80, jC87, jC88, n0.b(1711276032), n0.c(4289197008L), n0.c(4285458359L), n0.c(BodyPartID.bodyIdMax), 1610612736, 12);
        long jC91 = n0.c(4281908728L);
        long j49 = b1.f21648b;
        long jB4 = n0.b(809025016);
        long jC92 = n0.c(4281908728L);
        long jC93 = n0.c(4286436348L);
        long jB5 = n0.b(813552636);
        long jC94 = n0.c(4290438909L);
        long j50 = d.f16186h;
        long jB6 = n0.b(805365196);
        long j51 = d.f16189k;
        long jB7 = n0.b(654266962);
        long jC95 = n0.c(4278190080L);
        long jC96 = n0.c(BodyPartID.bodyIdMax);
        long jC97 = n0.c(4278979596L);
        long jC98 = n0.c(BodyPartID.bodyIdMax);
        long jC99 = n0.c(4279769112L);
        long jC100 = n0.c(4289769648L);
        long jC101 = n0.c(4281216558L);
        long jC102 = n0.c(4278979596L);
        long jC103 = n0.c(BodyPartID.bodyIdMax);
        f16222f = f2.c(jC91, j49, jB4, jC92, n0.c(4281908728L), jC93, j49, jB5, jC94, j50, j49, jB6, j50, jC95, jC96, jC97, jC98, jC99, jC100, n0.c(4281908728L), jC103, jC102, j51, j39, jB7, j51, jC101, n0.c(4280032284L), n0.c(4278190080L), n0.c(4279505940L), n0.c(4280163870L), n0.c(4278519045L));
        long jC104 = n0.c(4289222135L);
        long jB8 = n0.b(866670071);
        long jC105 = n0.c(4294174975L);
        long jC106 = n0.c(4290807036L);
        long jB9 = n0.b(868254972);
        long jC107 = n0.c(4294637055L);
        long jC108 = n0.c(4293425657L);
        long jB10 = n0.b(870873593);
        long jC109 = n0.c(4294833407L);
        long jB11 = n0.b(654266962);
        long jC110 = n0.c(4279307549L);
        long jC111 = n0.c(4294177017L);
        long jC112 = n0.c(4279899177L);
        long jC113 = n0.c(4294177017L);
        long jC114 = n0.c(4280819773L);
        long jC115 = n0.c(4291279837L);
        long jC116 = n0.c(4284106872L);
        long jC117 = n0.c(4282200149L);
        long jC118 = n0.c(4279899177L);
        long jC119 = n0.c(4294177017L);
        f16223g = f2.c(jC104, j39, jB8, jC105, n0.c(4292392190L), jC106, j49, jB9, jC107, jC108, j49, jB10, jC109, jC110, jC111, jC112, jC113, jC114, jC115, n0.c(4289222135L), jC119, jC118, j51, j39, jB11, j51, jC116, jC117, n0.c(3422552064L), n0.c(4280556600L), n0.c(4281214021L), n0.c(4279899177L));
    }

    public static final void a(a aVar, boolean z10, f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(903978782);
        if ((((kVarP.K(aVar) ? 4 : 2) | i10) & 131) == 130 && kVarP.s()) {
            kVarP.v();
        } else {
            e eVarA = c.a(aVar, h6.a.b(kVarP));
            final boolean zA = eVarA.a();
            e2 e2VarC = c(eVarA);
            final View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
            kVarP.L(-336105454);
            if (!view.isInEditMode()) {
                kVarP.L(-336104065);
                boolean zL = kVarP.l(view) | kVarP.c(zA);
                Object objG = kVarP.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: k9.h
                        @Override // eh.a
                        public final Object invoke() {
                            Context context = view.getContext();
                            r.d(context, "getContext(...)");
                            Activity activityB = j.b(context);
                            b.k kVar = activityB instanceof b.k ? (b.k) activityB : null;
                            if (kVar == null) {
                                return f0.f21461a;
                            }
                            Window window = kVar.getWindow();
                            g.a(kVar);
                            int i11 = Build.VERSION.SDK_INT;
                            x0 e2Var = i11 >= 35 ? new y3.e2(window) : i11 >= 30 ? new d2(window) : new a2(window);
                            boolean z11 = !zA;
                            e2Var.c(z11);
                            e2Var.b(z11);
                            return f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                }
                kVarP.T(false);
                l0 l0Var = o0.f31834a;
                kVarP.u((eh.a) objG);
            }
            kVarP.T(false);
            y.b(new x0.f2[]{c.f16177a.a(aVar), c.f16178b.a(eVarA)}, f1.c.b(55292894, new i(e2VarC, bVar), kVarP), kVarP, 56);
            z10 = true;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n5(aVar, z10, bVar, i10);
        }
    }

    public static final Activity b(Context context) {
        r.e(context, "<this>");
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            r.d(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    public static final e2 c(e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return f16217a;
            case 1:
                return f16219c;
            case 2:
                return f16220d;
            case 3:
                return f16221e;
            case 4:
                return f16223g;
            case 5:
                return f16218b;
            case 6:
                return f16222f;
            default:
                throw new l();
        }
    }
}
