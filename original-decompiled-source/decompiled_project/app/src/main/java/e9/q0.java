package e9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.domain.model.BuildState;
import j5.a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t0.ra;
import x0.h2;
import x0.j;
import x0.l1;
import x0.n1;
import x0.v1;

/* loaded from: classes.dex */
public final class q0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final p5.x navController, final long j10, s0 s0Var, x0.j jVar, final int i10) {
        int i11;
        s0 s0Var2;
        n1 n1Var;
        Object uVar;
        l1 l1Var;
        Context context;
        tg.e eVar;
        s0 s0Var3;
        x0.k kVar;
        final s0 s0Var4;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(2083410249);
        int i12 = i10 | (kVarP.l(navController) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | 128;
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            s0Var4 = s0Var;
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(s0.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                i11 = i12 & (-897);
                s0Var2 = (s0) w0VarB;
            } else {
                kVarP.v();
                i11 = i12 & (-897);
                s0Var2 = s0Var;
            }
            kVarP.U();
            n1 n1VarB = bg.b.b(s0Var2.f8522i, kVarP);
            String strC = f3.q.c(kotlin.jvm.internal.r.a((String) bg.b.b(s0Var2.f8524k, kVarP).getValue(), "aab") ? R.string.build_format_aab : R.string.build_format_apk, kVarP);
            n1 n1VarB2 = bg.b.b(s0Var2.f8527n, kVarP);
            n1 n1VarB3 = bg.b.b(s0Var2.f8528o, kVarP);
            n1 n1VarB4 = bg.b.b(s0Var2.f8526m, kVarP);
            n1 n1VarB5 = bg.b.b(s0Var2.f8529p, kVarP);
            kVarP.L(-1650971932);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new v1(0);
                kVarP.C(objG);
            }
            l1 l1Var2 = (l1) objG;
            kVarP.T(false);
            b0.m0 m0VarA = b0.u0.a(kVarP);
            Context context2 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            pg.f0 f0Var = pg.f0.f21461a;
            int i13 = i11;
            kVarP.L(-1650965731);
            boolean zL = kVarP.l(context2);
            Object objG2 = kVarP.g();
            if (zL || objG2 == obj) {
                objG2 = new androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.m(context2, 1);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.a(f0Var, (eh.l) objG2, kVarP);
            Integer numValueOf = Integer.valueOf(((Number) n1VarB5.getValue()).intValue());
            BuildState buildState = (BuildState) n1VarB.getValue();
            kVarP.L(-1650953677);
            boolean zK = kVarP.K(n1VarB) | kVarP.K(n1VarB5);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj) {
                objG3 = new s(n1VarB, n1VarB5, l1Var2, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.e(numValueOf, buildState, (eh.p) objG3, kVarP);
            Integer numValueOf2 = Integer.valueOf(((List) n1VarB2.getValue()).size());
            kVarP.L(-1650934543);
            boolean zK2 = kVarP.K(n1VarB2) | kVarP.K(m0VarA);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj) {
                objG4 = new t(m0VarA, n1VarB2, null);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG4, numValueOf2, kVarP);
            Long lValueOf = Long.valueOf(j10);
            BuildState buildState2 = (BuildState) n1VarB.getValue();
            kVarP.L(-1650929600);
            int i14 = i13 & 112;
            boolean zK3 = (i14 == 32) | kVarP.K(n1VarB) | kVarP.l(s0Var2);
            Object objG5 = kVarP.g();
            if (zK3 || objG5 == obj) {
                n1Var = n1VarB;
                l1Var = l1Var2;
                context = context2;
                eVar = null;
                uVar = new u(j10, s0Var2, n1Var, null);
                s0Var3 = s0Var2;
                kVarP.C(uVar);
            } else {
                n1Var = n1VarB;
                uVar = objG5;
                l1Var = l1Var2;
                context = context2;
                eVar = null;
                s0Var3 = s0Var2;
            }
            kVarP.T(false);
            x0.o0.e(lValueOf, buildState2, (eh.p) uVar, kVarP);
            kVarP.L(-1650924763);
            Object objG6 = kVarP.g();
            if (objG6 == obj) {
                objG6 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG6);
            }
            n1 n1Var2 = (n1) objG6;
            kVarP.T(false);
            BuildState buildState3 = (BuildState) n1Var.getValue();
            kVarP.L(-1650922467);
            boolean zK4 = kVarP.K(n1Var);
            Object objG7 = kVarP.g();
            if (zK4 || objG7 == obj) {
                objG7 = new v(n1Var, n1Var2, eVar);
                kVarP.C(objG7);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG7, buildState3, kVarP);
            androidx.lifecycle.t tVar = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
            BuildState buildState4 = (BuildState) n1Var.getValue();
            kVarP.L(-1650913592);
            boolean zK5 = kVarP.K(n1Var) | kVarP.l(navController) | kVarP.l(tVar) | (i14 == 32);
            Object objG8 = kVarP.g();
            if (zK5 || objG8 == obj) {
                n1 n1Var3 = n1Var;
                Object xVar = new x(navController, tVar, j10, n1Var3, null);
                n1Var = n1Var3;
                kVarP.C(xVar);
                objG8 = xVar;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG8, buildState4, kVarP);
            f1.b bVarB = f1.c.b(-1496604659, new a0(strC, navController), kVarP);
            long j11 = q1.b1.f21653g;
            z.z zVar = new z.z();
            s0 s0Var5 = s0Var3;
            f1.b bVarB2 = f1.c.b(-304109992, new o0(strC, n1Var, l1Var, s0Var5, j10, context, n1VarB4, n1VarB3, n1Var2, navController, m0VarA, n1VarB2), kVarP);
            kVar = kVarP;
            ra.a(null, bVarB, null, null, null, 0, j11, 0L, zVar, bVarB2, kVar, 806879280, 189);
            s0Var4 = s0Var5;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j10, s0Var4, i10) { // from class: e9.r

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f8510b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s0 f8511c;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    q0.a(this.f8509a, this.f8510b, this.f8511c, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(Context context, String str, String str2, String str3, String str4, List list) {
        if (mh.x.A(str)) {
            str = c(R.string.mail_report_default_project, new Object[0]);
        }
        String strC = c(R.string.build_failed_email_subject, str);
        String str5 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault()).format(new Date());
        List listX = qg.x.X(100, list);
        StringBuilder sb = new StringBuilder();
        sb.append(c(R.string.mail_report_title, new Object[0]));
        sb.append('\n');
        sb.append(c(R.string.mail_report_intro, new Object[0]));
        sb.append('\n');
        sb.append(c(R.string.mail_report_intro2, new Object[0]));
        sb.append("\n\n");
        sb.append(c(R.string.mail_report_section_project, new Object[0]));
        sb.append('\n');
        sb.append(c(R.string.mail_report_project_name, str));
        sb.append('\n');
        if (!mh.x.A(str2)) {
            sb.append(c(R.string.mail_report_package_name, str2));
            sb.append('\n');
        }
        sb.append(c(R.string.mail_report_format, str3));
        sb.append('\n');
        sb.append(c(R.string.mail_report_date, str5));
        sb.append("\n\n");
        sb.append(c(R.string.mail_report_section_device, new Object[0]));
        sb.append('\n');
        sb.append(c(R.string.mail_report_device, Build.MANUFACTURER, Build.MODEL));
        sb.append('\n');
        sb.append(c(R.string.mail_report_android, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
        sb.append('\n');
        sb.append(c(R.string.mail_report_app_version, "1.32", 45));
        sb.append("\n\n");
        sb.append(c(R.string.mail_report_section_error, new Object[0]));
        sb.append('\n');
        if (mh.x.A(str4)) {
            str4 = c(R.string.mail_report_unknown_error, new Object[0]);
        }
        sb.append(str4);
        sb.append("\n\n");
        sb.append(c(R.string.mail_report_section_logs, Integer.valueOf(listX.size())));
        sb.append('\n');
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        sb.append('\n');
        sb.append(c(R.string.mail_report_end, new Object[0]));
        sb.append('\n');
        String string = sb.toString();
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:chat.mobai@gmail.com?subject=" + Uri.encode(strC) + "&body=" + Uri.encode(string)));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"chat.mobai@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", strC);
        intent.putExtra("android.intent.extra.TEXT", string);
        try {
            String string2 = context.getString(R.string.build_failed_email_chooser);
            kotlin.jvm.internal.r.d(string2, "getString(...)");
            context.startActivity(Intent.createChooser(intent, string2));
        } catch (Exception unused) {
            org.bouncycastle.crypto.engines.a.b(context, R.string.settings_feedback_no_app, context, 1);
        }
    }

    public static final String c(int i10, Object... objArr) {
        return BuildLogger.INSTANCE.localizedEn(i10, Arrays.copyOf(objArr, objArr.length));
    }
}
