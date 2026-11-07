package t8;

import android.content.SharedPreferences;
import android.os.SystemClock;
import b9.d4;
import f9.i6;
import f9.me;
import f9.ne;
import f9.oe;
import f9.pe;
import h8.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$stream$2", f = "AiSessionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x3 extends vg.i implements eh.p<h8.v, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<String> f28569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f28572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3 f28574h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f28575j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f28576k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<h8.t> f28577l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(m3 m3Var, kotlin.jvm.internal.g0<String> g0Var, String str, String str2, Long l10, int i10, z3 z3Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.b0 b0Var, kotlin.jvm.internal.g0<h8.t> g0Var2, tg.e<? super x3> eVar) {
        super(2, eVar);
        this.f28568b = m3Var;
        this.f28569c = g0Var;
        this.f28570d = str;
        this.f28571e = str2;
        this.f28572f = l10;
        this.f28573g = i10;
        this.f28574h = z3Var;
        this.f28575j = f0Var;
        this.f28576k = b0Var;
        this.f28577l = g0Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        x3 x3Var = new x3(this.f28568b, this.f28569c, this.f28570d, this.f28571e, this.f28572f, this.f28573g, this.f28574h, this.f28575j, this.f28576k, this.f28577l, eVar);
        x3Var.f28567a = obj;
        return x3Var;
    }

    @Override // eh.p
    public final Object invoke(h8.v vVar, tg.e<? super pg.f0> eVar) {
        return ((x3) create(vVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v18, types: [T, java.lang.String] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        h8.v vVar = (h8.v) this.f28567a;
        int i10 = 1;
        if (vVar instanceof v.e) {
            m3 m3Var = this.f28568b;
            v.e eVar = (v.e) vVar;
            String str = eVar.f12483a;
            m3Var.f28315j = str;
            m3Var.f28307b.c(str, "sessionId");
            kotlin.jvm.internal.g0<String> g0Var = this.f28569c;
            ?? r72 = eVar.f12484b;
            g0Var.f16327a = r72;
            this.f28568b.f28318m = r72;
            if (!kotlin.jvm.internal.r.a(this.f28570d, "repair")) {
                m3 m3Var2 = this.f28568b;
                String str2 = eVar.f12484b;
                m3Var2.f28317l = str2;
                h8.a aVar2 = m3Var2.f28311f;
                String str3 = eVar.f12483a;
                String mode = this.f28570d;
                String prompt = this.f28571e;
                Long l10 = this.f28572f;
                boolean z10 = ((b3) m3Var2.f28312g.getValue()).f28114d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                kotlin.jvm.internal.r.e(mode, "mode");
                kotlin.jvm.internal.r.e(prompt, "prompt");
                synchronized (aVar2) {
                    try {
                        SharedPreferences.Editor editorEdit = aVar2.f12345d.edit();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sessionId", str3);
                        jSONObject.put("mode", mode);
                        jSONObject.put("prompt", prompt);
                        if (l10 != null) {
                            jSONObject.put("projectId", l10.longValue());
                        }
                        jSONObject.put("autoMode", z10);
                        jSONObject.put("startedAt", jCurrentTimeMillis);
                        pg.f0 f0Var = pg.f0.f21461a;
                        editorEdit.putString(str2, jSONObject.toString()).commit();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f28568b.o(this.f28573g, new i6(vVar, i10));
            m3 m3Var3 = this.f28568b;
            if (m3Var3.f28319n) {
                m3Var3.f28319n = false;
                h8.a aVar3 = m3Var3.f28311f;
                String str4 = eVar.f12483a;
                String str5 = eVar.f12484b;
                aVar3.getClass();
                ph.h.c(aVar3.f12347f, null, null, new h8.c(aVar3, str4, str5, null), 3);
                throw new CancellationException("stopped");
            }
        } else if (vVar instanceof v.d) {
            m3 m3Var4 = this.f28568b;
            m3Var4.o(this.f28573g, new me(vVar, m3Var4));
        } else if (vVar instanceof v.g) {
            this.f28568b.o(this.f28573g, new b9.a4(vVar, 2));
        } else if (vVar instanceof v.f) {
            m3 m3Var5 = this.f28568b;
            m3Var5.o(this.f28573g, new ne(vVar, m3Var5));
        } else if (vVar instanceof v.a) {
            z3 z3Var = this.f28574h;
            String str6 = ((v.a) vVar).f12473a;
            StringBuilder sb = z3Var.f28613b;
            int i11 = 0;
            while (true) {
                int iX = mh.x.x(str6, '\n', i11, 4);
                if (iX < 0) {
                    break;
                }
                sb.append((CharSequence) str6, i11, iX);
                z3Var.f28612a.add(sb.toString());
                sb.setLength(0);
                i11 = iX + 1;
            }
            sb.append((CharSequence) str6, i11, str6.length());
            long jUptimeMillis = SystemClock.uptimeMillis();
            kotlin.jvm.internal.f0 f0Var2 = this.f28575j;
            if (jUptimeMillis - f0Var2.f16326a > 80) {
                f0Var2.f16326a = jUptimeMillis;
                final m3 m3Var6 = this.f28568b;
                int i12 = this.f28573g;
                z3 z3Var2 = this.f28574h;
                ArrayList<String> arrayList = z3Var2.f28612a;
                StringBuilder sb2 = z3Var2.f28613b;
                final List listC0 = sb2.length() == 0 ? qg.x.c0(arrayList) : qg.x.P(sb2.toString(), arrayList);
                m3Var6.o(i12, new eh.l(m3Var6, listC0) { // from class: t8.c3

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f28148a;

                    {
                        this.f28148a = listC0;
                    }

                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        y3 it = (y3) obj2;
                        kotlin.jvm.internal.r.e(it, "it");
                        y3 y3VarH = m3.h(it);
                        String str7 = it.f28588h;
                        if (kotlin.jvm.internal.r.a(str7, "planning")) {
                            str7 = "writing";
                        }
                        return y3.a(y3VarH, null, null, null, str7, this.f28148a, null, false, null, null, null, null, 0, null, null, null, 4193919);
                    }
                });
            }
        } else if (vVar instanceof v.b) {
            final m3 m3Var7 = this.f28568b;
            int i13 = this.f28573g;
            z3 z3Var3 = this.f28574h;
            ArrayList<String> arrayList2 = z3Var3.f28612a;
            StringBuilder sb3 = z3Var3.f28613b;
            final List listC02 = sb3.length() == 0 ? qg.x.c0(arrayList2) : qg.x.P(sb3.toString(), arrayList2);
            m3Var7.o(i13, new eh.l(m3Var7, listC02) { // from class: t8.c3

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f28148a;

                {
                    this.f28148a = listC02;
                }

                @Override // eh.l
                public final Object invoke(Object obj2) {
                    y3 it = (y3) obj2;
                    kotlin.jvm.internal.r.e(it, "it");
                    y3 y3VarH = m3.h(it);
                    String str7 = it.f28588h;
                    if (kotlin.jvm.internal.r.a(str7, "planning")) {
                        str7 = "writing";
                    }
                    return y3.a(y3VarH, null, null, null, str7, this.f28148a, null, false, null, null, null, null, 0, null, null, null, 4193919);
                }
            });
            this.f28576k.f16318a = true;
            boolean z11 = kotlin.jvm.internal.r.a(this.f28570d, "repair") || this.f28568b.f28311f.c(((v.b) vVar).f12475b);
            kotlin.jvm.internal.g0<h8.t> g0Var2 = this.f28577l;
            v.b bVar = (v.b) vVar;
            T t3 = bVar.f12478e;
            if (!z11) {
                t3 = 0;
            }
            g0Var2.f16327a = t3;
            Long l11 = bVar.f12477d;
            if (l11 != null) {
                g8.p pVar = this.f28568b.f28310e;
                long jLongValue = l11.longValue();
                sh.z0 z0Var = pVar.f11603g;
                g8.d dVar = (g8.d) z0Var.getValue();
                if (dVar == null) {
                    dVar = new g8.d(0L, false, null, false);
                }
                z0Var.j(null, new g8.d(jLongValue, dVar.f11562b, dVar.f11563c, dVar.f11564d));
            }
            if (bVar.f12479f) {
                this.f28568b.f28310e.l();
            }
            this.f28568b.o(this.f28573g, new oe(vVar, 2));
            if (!z11) {
                this.f28568b.o(this.f28573g, new d4(2));
            } else if (bVar.f12478e == null) {
                this.f28568b.o(this.f28573g, new h8.l(1));
            }
        } else {
            if (!(vVar instanceof v.c)) {
                throw new pg.l();
            }
            String str7 = this.f28569c.f16327a;
            if (str7 != null) {
                this.f28568b.f28311f.c(str7);
            }
            this.f28568b.f28310e.l();
            this.f28576k.f16318a = true;
            this.f28568b.o(this.f28573g, new pe(vVar, 1));
        }
        return pg.f0.f21461a;
    }
}
