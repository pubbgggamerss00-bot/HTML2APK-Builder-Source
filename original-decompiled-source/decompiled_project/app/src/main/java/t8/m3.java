package t8;

import android.os.SystemClock;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.google.protobuf.DescriptorProtos;
import f9.vd;
import h8.f;
import h8.i;
import h8.m;
import h8.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class m3 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.l0 f28307b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.f f28308c;

    /* renamed from: d, reason: collision with root package name */
    public final h8.m f28309d;

    /* renamed from: e, reason: collision with root package name */
    public final g8.p f28310e;

    /* renamed from: f, reason: collision with root package name */
    public final h8.a f28311f;

    /* renamed from: g, reason: collision with root package name */
    public final sh.z0 f28312g;

    /* renamed from: h, reason: collision with root package name */
    public final sh.l0 f28313h;

    /* renamed from: i, reason: collision with root package name */
    public final sh.l0 f28314i;

    /* renamed from: j, reason: collision with root package name */
    public String f28315j;

    /* renamed from: k, reason: collision with root package name */
    public ph.l2 f28316k;

    /* renamed from: l, reason: collision with root package name */
    public String f28317l;

    /* renamed from: m, reason: collision with root package name */
    public String f28318m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28319n;

    /* renamed from: o, reason: collision with root package name */
    public int f28320o;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$1", f = "AiSessionViewModel.kt", l = {113}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public sh.j0 f28321a;

        /* renamed from: b, reason: collision with root package name */
        public Long f28322b;

        /* renamed from: c, reason: collision with root package name */
        public m3 f28323c;

        /* renamed from: d, reason: collision with root package name */
        public Object f28324d;

        /* renamed from: e, reason: collision with root package name */
        public Long f28325e;

        /* renamed from: f, reason: collision with root package name */
        public b3 f28326f;

        /* renamed from: g, reason: collision with root package name */
        public int f28327g;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Long f28329j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f28329j = l10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return m3.this.new a(this.f28329j, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Type inference failed for: r8v5, types: [sh.j0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:13:0x0060). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            m3 m3Var;
            sh.z0 z0Var;
            Long l10;
            Object value;
            Object byId;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28327g;
            if (i10 == 0) {
                pg.q.b(obj);
                m3 m3Var2 = m3.this;
                m3Var = m3Var2;
                z0Var = m3Var2.f28312g;
                l10 = this.f28329j;
                value = z0Var.getValue();
                b3 b3Var = (b3) value;
                h8.m mVar = m3Var.f28309d;
                long jLongValue = l10.longValue();
                this.f28321a = z0Var;
                this.f28322b = l10;
                this.f28323c = m3Var;
                this.f28324d = value;
                this.f28325e = l10;
                this.f28326f = b3Var;
                this.f28327g = 1;
                byId = mVar.f12417b.f18583a.getById(jLongValue, this);
                if (byId != aVar) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b3 b3Var2 = this.f28326f;
                Long l11 = this.f28325e;
                value = this.f28324d;
                m3Var = this.f28323c;
                Long l12 = this.f28322b;
                ?? r82 = this.f28321a;
                pg.q.b(obj);
                b3 b3Var3 = b3Var2;
                sh.z0 z0Var2 = r82;
                Long l13 = l11;
                l10 = l12;
                byId = obj;
                ProjectEntity projectEntity = (ProjectEntity) byId;
                if (!z0Var2.a(value, b3.a(b3Var3, null, l13, projectEntity == null ? projectEntity.getAppName() : null, false, false, false, null, 249))) {
                    return pg.f0.f21461a;
                }
                z0Var = z0Var2;
                value = z0Var.getValue();
                b3 b3Var4 = (b3) value;
                h8.m mVar2 = m3Var.f28309d;
                long jLongValue2 = l10.longValue();
                this.f28321a = z0Var;
                this.f28322b = l10;
                this.f28323c = m3Var;
                this.f28324d = value;
                this.f28325e = l10;
                this.f28326f = b3Var4;
                this.f28327g = 1;
                byId = mVar2.f12417b.f18583a.getById(jLongValue2, this);
                if (byId != aVar) {
                    return aVar;
                }
                sh.z0 z0Var3 = z0Var;
                b3Var3 = b3Var4;
                z0Var2 = z0Var3;
                l13 = l10;
                ProjectEntity projectEntity2 = (ProjectEntity) byId;
                if (!z0Var2.a(value, b3.a(b3Var3, null, l13, projectEntity2 == null ? projectEntity2.getAppName() : null, false, false, false, null, 249))) {
                }
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$loadHistory$2", f = "AiSessionViewModel.kt", l = {132}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28330a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f28332c = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return m3.this.new b(this.f28332c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objI;
            Object value2;
            b3 b3Var;
            ArrayList arrayList;
            boolean z10;
            String str;
            m3 m3Var = m3.this;
            sh.z0 z0Var = m3Var.f28312g;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28330a;
            boolean z11 = true;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    g8.p pVar = m3Var.f28310e;
                    String str2 = this.f28332c;
                    this.f28330a = 1;
                    objI = pVar.i(str2, this);
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    objI = obj;
                }
                List<Map> list = (List) objI;
                ArrayList arrayList2 = new ArrayList();
                for (Map map : list) {
                    Object obj2 = map.get("status");
                    String str3 = obj2 instanceof String ? (String) obj2 : null;
                    Object obj3 = map.get("credits");
                    Number number = obj3 instanceof Number ? (Number) obj3 : null;
                    int iIntValue = number != null ? number.intValue() : 0;
                    if (kotlin.jvm.internal.r.a(map.get("mode"), "repair")) {
                        y3 y3Var = (y3) qg.x.K(arrayList2);
                        if (y3Var != null) {
                            int i11 = qg.p.i(arrayList2);
                            Integer num = y3Var.f28591k;
                            arrayList2.set(i11, y3.a(y3Var, null, null, null, null, null, Integer.valueOf((num != null ? num.intValue() : 0) + iIntValue), false, null, null, null, null, 0, null, null, null, 4193279));
                        }
                    } else {
                        if (kotlin.jvm.internal.r.a(str3, "done") || kotlin.jvm.internal.r.a(str3, "failed")) {
                            ArrayList arrayList3 = new ArrayList();
                            StringBuilder sb = new StringBuilder();
                            Object obj4 = map.get("code");
                            String str4 = obj4 instanceof String ? (String) obj4 : null;
                            if (str4 == null) {
                                str4 = "";
                            }
                            z10 = z11;
                            int i12 = 0;
                            while (true) {
                                int iX = mh.x.x(str4, '\n', i12, 4);
                                if (iX < 0) {
                                    break;
                                }
                                sb.append((CharSequence) str4, i12, iX);
                                arrayList3.add(sb.toString());
                                sb.setLength(0);
                                i12 = iX + 1;
                            }
                            sb.append((CharSequence) str4, i12, str4.length());
                            int size = arrayList2.size() - 1000000;
                            Object obj5 = map.get("prompt");
                            String str5 = obj5 instanceof String ? (String) obj5 : null;
                            String str6 = str5 == null ? "" : str5;
                            boolean z12 = !kotlin.jvm.internal.r.a(map.get("mode"), "new");
                            Object obj6 = map.get("text");
                            String str7 = obj6 instanceof String ? (String) obj6 : null;
                            String str8 = str7 == null ? "" : str7;
                            List listC0 = sb.length() == 0 ? qg.x.c0(arrayList3) : qg.x.P(sb.toString(), arrayList3);
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            Object obj7 = map.get("free");
                            Boolean bool = obj7 instanceof Boolean ? (Boolean) obj7 : null;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            if (kotlin.jvm.internal.r.a(str3, "failed")) {
                                Object obj8 = map.get("errorCode");
                                String str9 = obj8 instanceof String ? (String) obj8 : null;
                                if (str9 == null) {
                                    str9 = "ai_unavailable";
                                }
                                str = str9;
                            } else {
                                str = null;
                            }
                            Object obj9 = map.get("id");
                            arrayList2.add(new y3(size, str6, z12, str8, listC0, numValueOf, zBooleanValue, str, this.f28332c, obj9 instanceof String ? (String) obj9 : null, 1175664));
                        }
                        z11 = z10;
                    }
                    z10 = z11;
                    z11 = z10;
                }
                do {
                    value2 = z0Var.getValue();
                    b3Var = (b3) value2;
                    List<y3> list2 = b3Var.f28111a;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        String str10 = ((y3) it.next()).f28600t;
                        if (str10 != null) {
                            arrayList4.add(str10);
                        }
                    }
                    Set setH0 = qg.x.h0(arrayList4);
                    arrayList = new ArrayList();
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj10 = arrayList2.get(i13);
                        i13++;
                        if (!qg.x.w(setH0, ((y3) obj10).f28600t)) {
                            arrayList.add(obj10);
                        }
                    }
                } while (!z0Var.a(value2, b3.a(b3Var, qg.x.O(b3Var.f28111a, arrayList), null, null, false, false, false, null, 222)));
                return pg.f0.f21461a;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception unused) {
                do {
                    value = z0Var.getValue();
                } while (!z0Var.a(value, b3.a((b3) value, null, null, null, false, false, true, null, 159)));
                return pg.f0.f21461a;
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$run$2", f = "AiSessionViewModel.kt", l = {251, 252}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28333a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28335c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28336d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f28337e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, String str, boolean z10, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f28335c = i10;
            this.f28336d = str;
            this.f28337e = z10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return m3.this.new c(this.f28335c, this.f28336d, this.f28337e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        
            if (t8.m3.f(r1, r11, r3, r2, r18) == r0) goto L30;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final String str;
            Object value;
            Object value2;
            Object objN;
            Object value3;
            m3 m3Var = m3.this;
            sh.z0 z0Var = m3Var.f28312g;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28333a;
            String str2 = this.f28336d;
            int i11 = this.f28335c;
            try {
                try {
                } catch (CancellationException e10) {
                    m3Var.o(i11, new u3());
                    throw e10;
                } catch (Exception e11) {
                    g8.a aVar2 = e11 instanceof g8.a ? (g8.a) e11 : null;
                    if (aVar2 == null || (str = aVar2.f11559a) == null) {
                        str = "ai_unavailable";
                    }
                    m3Var.o(i11, new eh.l() { // from class: t8.v3
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            return y3.a((y3) obj2, null, null, null, null, null, null, false, null, null, null, null, 0, str, null, null, 4062591);
                        }
                    });
                    m3Var.f28317l = null;
                    m3Var.f28318m = null;
                    m3Var.f28319n = false;
                    do {
                        value = z0Var.getValue();
                    } while (!z0Var.a(value, b3.a((b3) value, null, null, null, false, false, false, null, 239)));
                }
                if (i10 == 0) {
                    pg.q.b(obj);
                    int i12 = this.f28335c;
                    String str3 = this.f28337e ? "edit" : "new";
                    this.f28333a = 1;
                    objN = m3Var.n(i12, str2, str3, null, qg.z.f22752a, this);
                    if (objN == aVar) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    m3Var.f28317l = null;
                    m3Var.f28318m = null;
                    m3Var.f28319n = false;
                    do {
                        value3 = z0Var.getValue();
                    } while (!z0Var.a(value3, b3.a((b3) value3, null, null, null, false, false, false, null, 239)));
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                objN = obj;
                h8.t tVar = (h8.t) objN;
                if (tVar != null) {
                    this.f28333a = 2;
                }
                m3Var.f28317l = null;
                m3Var.f28318m = null;
                m3Var.f28319n = false;
                do {
                    value3 = z0Var.getValue();
                } while (!z0Var.a(value3, b3.a((b3) value3, null, null, null, false, false, false, null, 239)));
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                m3Var.f28317l = null;
                m3Var.f28318m = null;
                m3Var.f28319n = false;
                do {
                    value2 = z0Var.getValue();
                } while (!z0Var.a(value2, b3.a((b3) value2, null, null, null, false, false, false, null, 239)));
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m3(androidx.lifecycle.l0 savedState, h8.f client, h8.m store, g8.p account, h8.a background) {
        kotlin.jvm.internal.r.e(savedState, "savedState");
        kotlin.jvm.internal.r.e(client, "client");
        kotlin.jvm.internal.r.e(store, "store");
        kotlin.jvm.internal.r.e(account, "account");
        kotlin.jvm.internal.r.e(background, "background");
        this.f28307b = savedState;
        this.f28308c = client;
        this.f28309d = store;
        this.f28310e = account;
        this.f28311f = background;
        sh.z0 z0VarA = sh.a1.a(new b3(kotlin.jvm.internal.r.a(savedState.a("mode"), "auto"), 247));
        this.f28312g = z0VarA;
        this.f28313h = gg.a.a(z0VarA);
        this.f28314i = account.f11604h;
        String str = (String) savedState.a("sessionId");
        this.f28315j = (str == null || mh.x.A(str)) ? null : str;
        Long lG = (Long) savedState.a("projectId");
        if (lG == null) {
            String str2 = this.f28315j;
            lG = str2 != null ? store.g(str2) : null;
        } else {
            lG = lG.longValue() <= 0 ? null : lG;
            if (lG == null) {
            }
        }
        if (lG != null) {
            String str3 = this.f28315j;
            this.f28315j = str3 == null ? store.f12419d.getString(String.valueOf(lG.longValue()), null) : str3;
            ph.h.c(androidx.lifecycle.x0.a(this), null, null, new a(lG, null), 3);
        }
        String str4 = (String) savedState.a("prompt");
        str4 = str4 == null ? "" : str4;
        String str5 = this.f28315j;
        if (str5 != null) {
            j(str5);
        }
        if (lG != null || mh.x.A(str4)) {
            return;
        }
        Object objA = savedState.a("started");
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.r.a(objA, bool)) {
            return;
        }
        savedState.c(bool, "started");
        m(str4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9 A[PHI: r0 r2 r3 r7 r8
      0x01e9: PHI (r0v21 long) = (r0v19 long), (r0v26 long) binds: [B:49:0x0192, B:57:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r2v13 kotlin.jvm.internal.g0) = (r2v10 kotlin.jvm.internal.g0), (r2v15 kotlin.jvm.internal.g0) binds: [B:49:0x0192, B:57:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r3v6 h8.t) = (r3v2 h8.t), (r3v8 h8.t) binds: [B:49:0x0192, B:57:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r7v12 t8.m3) = (r7v10 t8.m3), (r7v13 t8.m3) binds: [B:49:0x0192, B:57:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r8v7 int) = (r8v5 int), (r8v9 int) binds: [B:49:0x0192, B:57:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278 A[LOOP:0: B:76:0x0256->B:79:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19, types: [T, h8.i$a] */
    /* JADX WARN: Type inference failed for: r8v13, types: [T, h8.i$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(m3 m3Var, int i10, String str, h8.t tVar, vg.c cVar) throws Throwable {
        o3 o3Var;
        String str2;
        m3 m3Var2;
        int i11;
        long j10;
        m3 m3Var3;
        h8.t tVar2;
        Object obj;
        int i12;
        long jLongValue;
        String str3;
        sh.z0 z0Var;
        Object value;
        int i13;
        m3 m3Var4;
        final m.a aVar;
        String str4;
        kotlin.jvm.internal.g0 g0Var;
        ?? A;
        h8.t tVar3;
        kotlin.jvm.internal.g0 g0Var2;
        int i14;
        boolean z10;
        int i15;
        h8.t tVar4;
        h8.t tVar5;
        final kotlin.jvm.internal.g0 g0Var3;
        final m.a aVar2;
        m3 m3Var5;
        h8.j jVar;
        sh.z0 z0Var2;
        Object value2;
        h8.j jVar2;
        h8.u uVarA;
        h8.t tVar6 = tVar;
        h8.m mVar = m3Var.f28309d;
        if (cVar instanceof o3) {
            o3Var = (o3) cVar;
            int i16 = o3Var.f28375k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                o3Var.f28375k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                o3Var = new o3(m3Var, cVar);
            }
        }
        o3 o3Var2 = o3Var;
        Object objH = o3Var2.f28373h;
        ug.a aVar3 = ug.a.f29706a;
        final h8.u uVar = null;
        switch (o3Var2.f28375k) {
            case 0:
                pg.q.b(objH);
                if (tVar6 instanceof t.b) {
                    o3Var2.f28366a = m3Var;
                    o3Var2.f28367b = tVar6;
                    o3Var2.f28370e = i10;
                    o3Var2.f28375k = 1;
                    mVar.getClass();
                    wh.c cVar2 = ph.z0.f21632a;
                    Object objE = ph.h.e(wh.b.f31563c, new h8.n((t.b) tVar6, str, mVar, null), o3Var2);
                    if (objE != aVar3) {
                        m3Var3 = m3Var;
                        tVar2 = tVar6;
                        obj = objE;
                        i12 = i10;
                        pg.n nVar = (pg.n) obj;
                        jLongValue = ((Number) nVar.f21469a).longValue();
                        m.a aVar4 = (m.a) nVar.f21470b;
                        str3 = m3Var3.f28315j;
                        if (str3 != null) {
                            m3Var3.f28309d.f12419d.edit().putString(String.valueOf(jLongValue), str3).apply();
                        }
                        z0Var = m3Var3.f28312g;
                        do {
                            value = z0Var.getValue();
                        } while (!z0Var.a(value, b3.a((b3) value, null, new Long(jLongValue), null, false, false, false, ((t.b) tVar2).f12458b.f12470h, 125)));
                        o3Var2.f28366a = m3Var3;
                        o3Var2.f28367b = aVar4;
                        o3Var2.f28370e = i12;
                        o3Var2.f28375k = 2;
                        if (m3Var3.l(o3Var2) != aVar3) {
                            i13 = i12;
                            m3Var4 = m3Var3;
                            aVar = aVar4;
                            m3Var4.o(i13, new eh.l() { // from class: t8.f3
                                @Override // eh.l
                                public final Object invoke(Object obj2) {
                                    y3 it = (y3) obj2;
                                    kotlin.jvm.internal.r.e(it, "it");
                                    m.a aVar5 = aVar;
                                    return y3.a(it, null, null, null, null, null, null, false, aVar5.f12422b, aVar5.f12423c, aVar5.f12421a, null, 0, null, null, null, 4164991);
                                }
                            });
                            return pg.f0.f21461a;
                        }
                    }
                } else {
                    if (!(tVar6 instanceof t.a)) {
                        throw new pg.l();
                    }
                    Long l10 = ((b3) m3Var.f28312g.getValue()).f28112b;
                    if (l10 == null) {
                        return pg.f0.f21461a;
                    }
                    long jLongValue2 = l10.longValue();
                    o3Var2.f28366a = m3Var;
                    o3Var2.f28367b = str;
                    o3Var2.f28368c = tVar6;
                    o3Var2.f28370e = i10;
                    o3Var2.f28371f = jLongValue2;
                    o3Var2.f28375k = 3;
                    objH = mVar.h(jLongValue2, o3Var2);
                    if (objH != aVar3) {
                        str2 = str;
                        m3Var2 = m3Var;
                        i11 = i10;
                        j10 = jLongValue2;
                        str4 = (String) objH;
                        if (str4 == null) {
                            str4 = "";
                        }
                        g0Var = new kotlin.jvm.internal.g0();
                        A = h8.i.a(str4, ((t.a) tVar6).f12455a);
                        g0Var.f16327a = A;
                        if (A.f12408c.isEmpty()) {
                            m3Var2.o(i11, new g3());
                            i.a aVar5 = (i.a) g0Var.f16327a;
                            String str5 = aVar5.f12406a;
                            ArrayList arrayList = aVar5.f12408c;
                            o3Var2.f28366a = m3Var2;
                            o3Var2.f28367b = tVar6;
                            o3Var2.f28368c = g0Var;
                            o3Var2.f28370e = i11;
                            o3Var2.f28371f = j10;
                            o3Var2.f28375k = 4;
                            objH = m3Var2.n(i11, str2, "repair", str5, arrayList, o3Var2);
                            if (objH != aVar3) {
                                tVar3 = tVar6;
                                g0Var2 = g0Var;
                                i14 = i11;
                                tVar4 = (h8.t) objH;
                                if (tVar4 instanceof t.a) {
                                    i.a aVarA = h8.i.a(((i.a) g0Var2.f16327a).f12406a, ((t.a) tVar4).f12455a);
                                    g0Var2.f16327a = new i.a(((i.a) g0Var2.f16327a).f12407b + aVarA.f12407b, aVarA.f12406a, aVarA.f12408c);
                                }
                                i11 = i14;
                                g0Var = g0Var2;
                                tVar6 = tVar3;
                                long j11 = j10;
                                z10 = ((b3) m3Var2.f28312g.getValue()).f28114d;
                                h8.u uVar2 = z10 ? ((t.a) tVar6).f12456b : new h8.u(((t.a) tVar6).f12456b.f12469g, 959);
                                h8.m mVar2 = m3Var2.f28309d;
                                i.a aVar6 = (i.a) g0Var.f16327a;
                                String str6 = aVar6.f12407b > 0 ? aVar6.f12406a : null;
                                o3Var2.f28366a = m3Var2;
                                o3Var2.f28367b = tVar6;
                                o3Var2.f28368c = g0Var;
                                o3Var2.f28370e = i11;
                                o3Var2.f28372g = z10;
                                o3Var2.f28375k = 5;
                                mVar2.getClass();
                                wh.c cVar3 = ph.z0.f21632a;
                                objH = ph.h.e(wh.b.f31563c, new h8.r(mVar2, j11, str6, uVar2, null), o3Var2);
                                if (objH != aVar3) {
                                    i15 = i11;
                                    tVar5 = tVar6;
                                    g0Var3 = g0Var;
                                    aVar2 = (m.a) objH;
                                    if (z10 && (jVar = ((t.a) tVar5).f12456b.f12470h) != null) {
                                        z0Var2 = m3Var2.f28312g;
                                        while (true) {
                                            value2 = z0Var2.getValue();
                                            jVar2 = jVar;
                                            if (z0Var2.a(value2, b3.a((b3) value2, null, null, null, false, false, false, jVar2, CertificateBody.profileType))) {
                                                jVar = jVar2;
                                            }
                                        }
                                    }
                                    o3Var2.f28366a = m3Var2;
                                    o3Var2.f28367b = tVar5;
                                    o3Var2.f28368c = g0Var3;
                                    o3Var2.f28369d = aVar2;
                                    o3Var2.f28370e = i15;
                                    o3Var2.f28372g = z10;
                                    o3Var2.f28375k = 6;
                                    if (m3Var2.l(o3Var2) != aVar3) {
                                        m3Var5 = m3Var2;
                                        uVarA = h8.u.a(((t.a) tVar5).f12456b, qg.z.f22752a, 191);
                                        if (!z10 && !uVarA.b()) {
                                            uVar = uVarA;
                                        }
                                        m3Var5.o(i15, new eh.l() { // from class: t8.h3
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // eh.l
                                            public final Object invoke(Object obj2) {
                                                y3 it = (y3) obj2;
                                                kotlin.jvm.internal.r.e(it, "it");
                                                m.a aVar7 = aVar2;
                                                ArrayList arrayList2 = aVar7.f12421a;
                                                return y3.a(it, null, null, null, null, null, null, false, aVar7.f12422b, aVar7.f12423c, arrayList2, uVar, ((i.a) g0Var3.f16327a).f12408c.size(), null, null, null, 4066687);
                                            }
                                        });
                                        return pg.f0.f21461a;
                                    }
                                }
                            }
                        } else {
                            long j112 = j10;
                            z10 = ((b3) m3Var2.f28312g.getValue()).f28114d;
                            h8.u uVar22 = z10 ? ((t.a) tVar6).f12456b : new h8.u(((t.a) tVar6).f12456b.f12469g, 959);
                            h8.m mVar22 = m3Var2.f28309d;
                            i.a aVar62 = (i.a) g0Var.f16327a;
                            if (aVar62.f12407b > 0) {
                            }
                            o3Var2.f28366a = m3Var2;
                            o3Var2.f28367b = tVar6;
                            o3Var2.f28368c = g0Var;
                            o3Var2.f28370e = i11;
                            o3Var2.f28372g = z10;
                            o3Var2.f28375k = 5;
                            mVar22.getClass();
                            wh.c cVar32 = ph.z0.f21632a;
                            objH = ph.h.e(wh.b.f31563c, new h8.r(mVar22, j112, str6, uVar22, null), o3Var2);
                            if (objH != aVar3) {
                            }
                        }
                    }
                }
                return aVar3;
            case 1:
                int i17 = o3Var2.f28370e;
                h8.t tVar7 = (h8.t) o3Var2.f28367b;
                m3 m3Var6 = o3Var2.f28366a;
                pg.q.b(objH);
                i12 = i17;
                obj = objH;
                tVar2 = tVar7;
                m3Var3 = m3Var6;
                pg.n nVar2 = (pg.n) obj;
                jLongValue = ((Number) nVar2.f21469a).longValue();
                m.a aVar42 = (m.a) nVar2.f21470b;
                str3 = m3Var3.f28315j;
                if (str3 != null) {
                }
                z0Var = m3Var3.f28312g;
                do {
                    value = z0Var.getValue();
                } while (!z0Var.a(value, b3.a((b3) value, null, new Long(jLongValue), null, false, false, false, ((t.b) tVar2).f12458b.f12470h, 125)));
                o3Var2.f28366a = m3Var3;
                o3Var2.f28367b = aVar42;
                o3Var2.f28370e = i12;
                o3Var2.f28375k = 2;
                if (m3Var3.l(o3Var2) != aVar3) {
                }
                return aVar3;
            case 2:
                i13 = o3Var2.f28370e;
                aVar = (m.a) o3Var2.f28367b;
                m3Var4 = o3Var2.f28366a;
                pg.q.b(objH);
                m3Var4.o(i13, new eh.l() { // from class: t8.f3
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        y3 it = (y3) obj2;
                        kotlin.jvm.internal.r.e(it, "it");
                        m.a aVar52 = aVar;
                        return y3.a(it, null, null, null, null, null, null, false, aVar52.f12422b, aVar52.f12423c, aVar52.f12421a, null, 0, null, null, null, 4164991);
                    }
                });
                return pg.f0.f21461a;
            case 3:
                j10 = o3Var2.f28371f;
                int i18 = o3Var2.f28370e;
                tVar6 = (h8.t) o3Var2.f28368c;
                String str7 = (String) o3Var2.f28367b;
                m3Var2 = o3Var2.f28366a;
                pg.q.b(objH);
                i11 = i18;
                str2 = str7;
                str4 = (String) objH;
                if (str4 == null) {
                }
                g0Var = new kotlin.jvm.internal.g0();
                A = h8.i.a(str4, ((t.a) tVar6).f12455a);
                g0Var.f16327a = A;
                if (A.f12408c.isEmpty()) {
                }
                return aVar3;
            case 4:
                j10 = o3Var2.f28371f;
                i14 = o3Var2.f28370e;
                g0Var2 = (kotlin.jvm.internal.g0) o3Var2.f28368c;
                tVar3 = (h8.t) o3Var2.f28367b;
                m3Var2 = o3Var2.f28366a;
                pg.q.b(objH);
                tVar4 = (h8.t) objH;
                if (tVar4 instanceof t.a) {
                }
                i11 = i14;
                g0Var = g0Var2;
                tVar6 = tVar3;
                long j1122 = j10;
                z10 = ((b3) m3Var2.f28312g.getValue()).f28114d;
                h8.u uVar222 = z10 ? ((t.a) tVar6).f12456b : new h8.u(((t.a) tVar6).f12456b.f12469g, 959);
                h8.m mVar222 = m3Var2.f28309d;
                i.a aVar622 = (i.a) g0Var.f16327a;
                if (aVar622.f12407b > 0) {
                }
                o3Var2.f28366a = m3Var2;
                o3Var2.f28367b = tVar6;
                o3Var2.f28368c = g0Var;
                o3Var2.f28370e = i11;
                o3Var2.f28372g = z10;
                o3Var2.f28375k = 5;
                mVar222.getClass();
                wh.c cVar322 = ph.z0.f21632a;
                objH = ph.h.e(wh.b.f31563c, new h8.r(mVar222, j1122, str6, uVar222, null), o3Var2);
                if (objH != aVar3) {
                }
                return aVar3;
            case 5:
                z10 = o3Var2.f28372g;
                i15 = o3Var2.f28370e;
                g0Var = (kotlin.jvm.internal.g0) o3Var2.f28368c;
                tVar6 = (h8.t) o3Var2.f28367b;
                m3 m3Var7 = o3Var2.f28366a;
                pg.q.b(objH);
                m3Var2 = m3Var7;
                tVar5 = tVar6;
                g0Var3 = g0Var;
                aVar2 = (m.a) objH;
                if (z10) {
                    z0Var2 = m3Var2.f28312g;
                    while (true) {
                        value2 = z0Var2.getValue();
                        jVar2 = jVar;
                        if (z0Var2.a(value2, b3.a((b3) value2, null, null, null, false, false, false, jVar2, CertificateBody.profileType))) {
                        }
                        jVar = jVar2;
                    }
                    break;
                }
                o3Var2.f28366a = m3Var2;
                o3Var2.f28367b = tVar5;
                o3Var2.f28368c = g0Var3;
                o3Var2.f28369d = aVar2;
                o3Var2.f28370e = i15;
                o3Var2.f28372g = z10;
                o3Var2.f28375k = 6;
                if (m3Var2.l(o3Var2) != aVar3) {
                }
                return aVar3;
            case 6:
                z10 = o3Var2.f28372g;
                i15 = o3Var2.f28370e;
                aVar2 = o3Var2.f28369d;
                g0Var3 = (kotlin.jvm.internal.g0) o3Var2.f28368c;
                tVar5 = (h8.t) o3Var2.f28367b;
                m3Var5 = o3Var2.f28366a;
                pg.q.b(objH);
                uVarA = h8.u.a(((t.a) tVar5).f12456b, qg.z.f22752a, 191);
                if (!z10) {
                    uVar = uVarA;
                    break;
                }
                m3Var5.o(i15, new eh.l() { // from class: t8.h3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        y3 it = (y3) obj2;
                        kotlin.jvm.internal.r.e(it, "it");
                        m.a aVar7 = aVar2;
                        ArrayList arrayList2 = aVar7.f12421a;
                        return y3.a(it, null, null, null, null, null, null, false, aVar7.f12422b, aVar7.f12423c, arrayList2, uVar, ((i.a) g0Var3.f16327a).f12408c.size(), null, null, null, 4066687);
                    }
                });
                return pg.f0.f21461a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static y3 h(y3 y3Var) {
        if (y3Var.f28586f != null) {
            return y3Var;
        }
        int iElapsedRealtime = (int) ((SystemClock.elapsedRealtime() - y3Var.f28587g) / DescriptorProtos.Edition.EDITION_2023_VALUE);
        if (iElapsedRealtime < 1) {
            iElapsedRealtime = 1;
        }
        return y3.a(y3Var, null, null, Integer.valueOf(iElapsedRealtime), null, null, null, false, null, null, null, null, 0, null, null, null, 4194271);
    }

    @Override // androidx.lifecycle.w0
    public final void e() {
        this.f28311f.f();
    }

    public final void g() {
        String str = this.f28315j;
        String str2 = this.f28318m;
        if (str == null || str2 == null) {
            if (((b3) this.f28312g.getValue()).f28115e) {
                this.f28319n = true;
                return;
            }
            return;
        }
        h8.a aVar = this.f28311f;
        aVar.getClass();
        ph.h.c(aVar.f12347f, null, null, new h8.c(aVar, str, str2, null), 3);
        ph.l2 l2Var = this.f28316k;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(vg.c cVar) {
        p3 p3Var;
        String sourcePath;
        if (cVar instanceof p3) {
            p3Var = (p3) cVar;
            int i10 = p3Var.f28389c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p3Var.f28389c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p3Var = new p3(this, cVar);
            }
        }
        Object byId = p3Var.f28387a;
        ug.a aVar = ug.a.f29706a;
        int i11 = p3Var.f28389c;
        if (i11 == 0) {
            pg.q.b(byId);
            Long l10 = ((b3) this.f28312g.getValue()).f28112b;
            if (l10 == null) {
                return null;
            }
            long jLongValue = l10.longValue();
            p3Var.f28389c = 1;
            byId = this.f28309d.f12417b.f18583a.getById(jLongValue, p3Var);
            if (byId == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(byId);
        }
        ProjectEntity projectEntity = (ProjectEntity) byId;
        if (projectEntity == null || (sourcePath = projectEntity.getSourcePath()) == null) {
            return null;
        }
        File file = new File(sourcePath);
        if (file.isFile()) {
            return file;
        }
        return null;
    }

    public final void j(String sessionId) {
        Object value;
        kotlin.jvm.internal.r.e(sessionId, "sessionId");
        if (mh.x.A(sessionId)) {
            return;
        }
        sh.z0 z0Var = this.f28312g;
        if (((b3) z0Var.getValue()).f28116f) {
            return;
        }
        do {
            value = z0Var.getValue();
        } while (!z0Var.a(value, b3.a((b3) value, null, null, null, false, true, false, null, 159)));
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new b(sessionId, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        if (ph.t0.b(3000, r2) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011c -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i10, String str, String str2, boolean z10, vg.c cVar) {
        r3 r3Var;
        int i11;
        m3 m3Var;
        int i12;
        r3 r3Var2;
        int i13;
        String str3;
        String str4;
        boolean z11;
        m3 m3Var2;
        String str5;
        String str6;
        int i14;
        boolean z12;
        int i15;
        int i16;
        f.a aVar;
        if (cVar instanceof r3) {
            r3Var = (r3) cVar;
            int i17 = r3Var.f28437k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                r3Var.f28437k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                r3Var = new r3(this, cVar);
            }
        }
        Object obj = r3Var.f28435h;
        ug.a aVar2 = ug.a.f29706a;
        int i18 = r3Var.f28437k;
        if (i18 == 0) {
            pg.q.b(obj);
            i11 = i10;
            o(i11, new j3());
            m3Var = this;
            i12 = 60;
            r3Var2 = r3Var;
            i13 = 0;
            str3 = str;
            str4 = str2;
            z11 = z10;
            if (i13 < i12) {
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i16 = r3Var.f28433f;
                i15 = r3Var.f28432e;
                z12 = r3Var.f28434g;
                i14 = r3Var.f28431d;
                str6 = r3Var.f28430c;
                str5 = r3Var.f28429b;
                m3Var2 = r3Var.f28428a;
                pg.q.b(obj);
                String str7 = str6;
                r3 r3Var3 = r3Var;
                str4 = str7;
                boolean z13 = z12;
                i12 = i15;
                z11 = z13;
                str3 = str5;
                m3Var = m3Var2;
                i13 = i16 + 1;
                i11 = i14;
                r3Var2 = r3Var3;
                if (i13 < i12) {
                    m3Var.f28311f.f();
                    m3Var.o(i11, new d3());
                    return null;
                }
                h8.f fVar = m3Var.f28308c;
                r3Var2.f28428a = m3Var;
                r3Var2.f28429b = str3;
                r3Var2.f28430c = str4;
                r3Var2.f28431d = i11;
                r3Var2.f28434g = z11;
                r3Var2.f28432e = i12;
                r3Var2.f28433f = i13;
                r3Var2.f28437k = 1;
                Object objD = fVar.d(str3, str4, z11, r3Var2);
                if (objD != aVar2) {
                    m3 m3Var3 = m3Var;
                    str5 = str3;
                    obj = objD;
                    m3Var2 = m3Var3;
                    int i19 = i13;
                    str6 = str4;
                    r3Var = r3Var2;
                    i14 = i11;
                    i16 = i19;
                    int i20 = i12;
                    z12 = z11;
                    i15 = i20;
                    aVar = (f.a) obj;
                    if (aVar instanceof f.a.C0115a) {
                        if (kotlin.jvm.internal.r.a(str6, m3Var2.f28317l) && !m3Var2.f28311f.c(str6)) {
                            m3Var2.o(i14, new k3());
                            return null;
                        }
                        f.a.C0115a c0115a = (f.a.C0115a) aVar;
                        h8.t tVar = c0115a.f12385a;
                        if (c0115a.f12387c) {
                            m3Var2.f28310e.l();
                        }
                        m3Var2.o(i14, new q8.j2(c0115a, 1));
                        if (tVar == null) {
                            m3Var2.o(i14, new l3());
                        }
                        return tVar;
                    }
                    if (aVar instanceof f.a.b) {
                        m3Var2.f28311f.c(str6);
                        m3Var2.o(i14, new vd((f.a.b) aVar, 1));
                        return null;
                    }
                    if (!kotlin.jvm.internal.r.a(aVar, f.a.c.f12389a)) {
                        throw new pg.l();
                    }
                    r3Var.f28428a = m3Var2;
                    r3Var.f28429b = str5;
                    r3Var.f28430c = str6;
                    r3Var.f28431d = i14;
                    r3Var.f28434g = z12;
                    r3Var.f28432e = i15;
                    r3Var.f28433f = i16;
                    r3Var.f28437k = 2;
                }
                return aVar2;
            }
            i16 = r3Var.f28433f;
            i15 = r3Var.f28432e;
            z12 = r3Var.f28434g;
            i14 = r3Var.f28431d;
            str6 = r3Var.f28430c;
            str5 = r3Var.f28429b;
            m3Var2 = r3Var.f28428a;
            pg.q.b(obj);
            aVar = (f.a) obj;
            if (aVar instanceof f.a.C0115a) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(vg.c cVar) {
        s3 s3Var;
        m3 m3Var;
        Object value;
        if (cVar instanceof s3) {
            s3Var = (s3) cVar;
            int i10 = s3Var.f28453d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                s3Var.f28453d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                s3Var = new s3(this, cVar);
            }
        }
        Object byId = s3Var.f28451b;
        ug.a aVar = ug.a.f29706a;
        int i11 = s3Var.f28453d;
        if (i11 == 0) {
            pg.q.b(byId);
            Long l10 = ((b3) this.f28312g.getValue()).f28112b;
            if (l10 == null) {
                return pg.f0.f21461a;
            }
            long jLongValue = l10.longValue();
            s3Var.f28450a = this;
            s3Var.f28453d = 1;
            byId = this.f28309d.f12417b.f18583a.getById(jLongValue, s3Var);
            if (byId == aVar) {
                return aVar;
            }
            m3Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m3Var = s3Var.f28450a;
            pg.q.b(byId);
        }
        ProjectEntity projectEntity = (ProjectEntity) byId;
        String appName = projectEntity != null ? projectEntity.getAppName() : null;
        sh.z0 z0Var = m3Var.f28312g;
        do {
            value = z0Var.getValue();
        } while (!z0Var.a(value, b3.a((b3) value, null, null, appName, false, false, false, null, 251)));
        return pg.f0.f21461a;
    }

    public final void m(String str, boolean z10) {
        m3 m3Var = this;
        int i10 = m3Var.f28320o;
        m3Var.f28320o = i10 + 1;
        while (true) {
            sh.z0 z0Var = m3Var.f28312g;
            Object value = z0Var.getValue();
            b3 b3Var = (b3) value;
            int i11 = i10;
            i10 = i11;
            if (z0Var.a(value, b3.a(b3Var, qg.x.P(new y3(i11, str, z10, null, null, null, false, null, null, null, 4194296), b3Var.f28111a), null, null, true, false, false, null, 238))) {
                this.f28316k = ph.h.c(androidx.lifecycle.x0.a(this), null, null, new c(i10, str, z10, null), 3);
                return;
            }
            m3Var = this;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(2:15|16)(2:17|18))(2:19|20))(8:21|95|22|23|64|(2:66|(1:73)(2:69|(1:89)(1:72)))|74|75))(14:26|50|52|99|53|54|93|55|56|97|57|(1:59)(1:60)|(5:63|64|(0)|74|75)|89))(1:27))(18:28|(1:30)(1:(1:(3:34|(1:37)|89)(1:39))(16:40|41|(1:43)(1:(3:46|(13:49|50|52|99|53|54|93|55|56|97|57|(0)(0)|(0))|89)(1:51))|44|52|99|53|54|93|55|56|97|57|(0)(0)|(0)|89))|31|41|(0)(0)|44|52|99|53|54|93|55|56|97|57|(0)(0)|(0)|89)|38|41|(0)(0)|44|52|99|53|54|93|55|56|97|57|(0)(0)|(0)|89|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0270, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0272, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0273, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0276, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
    
        r7 = r16;
        r14 = r23;
        r9 = r24;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x027f, code lost:
    
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0282, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0283, code lost:
    
        r10 = r2;
        r14 = r13;
        r7 = r16;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0294, code lost:
    
        r0 = !kotlin.jvm.internal.r.a(r10, r7);
        r4.f28544a = null;
        r4.f28545b = null;
        r4.f28546c = null;
        r4.f28547d = null;
        r4.f28548e = null;
        r4.f28549f = null;
        r4.f28550g = null;
        r4.f28551h = null;
        r4.f28552j = null;
        r4.f28556n = 4;
        r0 = r14.k(r2, r3, r6, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c0, code lost:
    
        if (r0 == r5) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0222 A[Catch: IOException -> 0x0272, TRY_LEAVE, TryCatch #2 {IOException -> 0x0272, blocks: (B:57:0x01f6, B:60:0x0222), top: B:97:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i10, String str, String str2, String str3, List list, vg.c cVar) throws Throwable {
        w3 w3Var;
        Long l10;
        String str4;
        int i11;
        String str5;
        m3 m3Var;
        List list2;
        Long l11;
        String str6;
        String str7;
        String str8;
        m3 m3Var2;
        String str9;
        String str10;
        int i12;
        String str11;
        Object obj;
        String str12;
        String str13;
        int i13;
        String str14;
        String str15;
        List list3;
        String str16;
        String str17;
        String str18;
        List list4;
        String str19;
        String str20;
        int i14;
        String str21;
        Long l12;
        String str22;
        String str23;
        m3 m3Var3;
        kotlin.jvm.internal.g0 g0Var;
        int i15;
        Object objE;
        kotlin.jvm.internal.b0 b0Var;
        kotlin.jvm.internal.g0 g0Var2;
        String str24 = str;
        String str25 = str2;
        if (cVar instanceof w3) {
            w3Var = (w3) cVar;
            int i16 = w3Var.f28556n;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                w3Var.f28556n = i16 - PKIFailureInfo.systemUnavail;
            } else {
                w3Var = new w3(this, cVar);
            }
        }
        Object obj2 = w3Var.f28554l;
        ug.a aVar = ug.a.f29706a;
        int i17 = w3Var.f28556n;
        if (i17 == 0) {
            pg.q.b(obj2);
            l10 = ((b3) this.f28312g.getValue()).f28112b;
            str4 = this.f28315j;
            if (kotlin.jvm.internal.r.a(str25, "new")) {
                i11 = i10;
                list2 = list;
                str5 = str24;
                m3Var = this;
                str6 = str25;
                l11 = l10;
            } else {
                if (str3 != null) {
                    i11 = i10;
                    str5 = str24;
                    m3Var = this;
                    list2 = list;
                    l11 = l10;
                    str6 = str25;
                    str7 = str4;
                    str8 = str3;
                    if (kotlin.jvm.internal.r.a(str25, "new")) {
                        str12 = str24;
                        str13 = str6;
                        i13 = i11;
                        str14 = str8;
                        str15 = str7;
                        list3 = list2;
                        obj = "new";
                    } else {
                        if (l11 != null) {
                            obj = "new";
                            long jLongValue = l11.longValue();
                            h8.m mVar = m3Var.f28309d;
                            w3Var.f28544a = m3Var;
                            w3Var.f28545b = str5;
                            w3Var.f28546c = str25;
                            w3Var.f28547d = list2;
                            w3Var.f28548e = l11;
                            w3Var.f28549f = str7;
                            w3Var.f28550g = str6;
                            w3Var.f28551h = str24;
                            w3Var.f28552j = str8;
                            w3Var.f28553k = i11;
                            String str26 = str24;
                            w3Var.f28556n = 2;
                            Object objC = mVar.c(jLongValue, w3Var);
                            if (objC != aVar) {
                                String str27 = str8;
                                str16 = str25;
                                str17 = str27;
                                String str28 = str5;
                                str18 = str7;
                                list4 = list2;
                                str19 = str28;
                                str20 = str6;
                                obj2 = objC;
                                i14 = i11;
                                str21 = str26;
                                i13 = i14;
                                str14 = str17;
                                str22 = (String) obj2;
                                str12 = str21;
                                str25 = str16;
                                list3 = list4;
                                str13 = str20;
                                str15 = str18;
                                l12 = l11;
                                str5 = str19;
                                boolean z10 = ((b3) m3Var.f28312g.getValue()).f28114d;
                                String language = Locale.getDefault().getLanguage();
                                kotlin.jvm.internal.r.d(language, "getLanguage(...)");
                                h8.s sVar = new h8.s(str15, str13, str12, str14, str22, list3, z10, language);
                                z3 z3Var = new z3();
                                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                                kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
                                kotlin.jvm.internal.g0 g0Var4 = new kotlin.jvm.internal.g0();
                                kotlin.jvm.internal.b0 b0Var2 = new kotlin.jvm.internal.b0();
                                h8.f fVar = m3Var.f28308c;
                                String str29 = str25;
                                m3 m3Var4 = m3Var;
                                x3 x3Var = new x3(m3Var4, g0Var3, str29, str5, l12, i13, z3Var, f0Var, b0Var2, g0Var4, null);
                                m3Var3 = m3Var4;
                                g0Var = g0Var3;
                                str23 = str29;
                                int i18 = i13;
                                w3Var.f28544a = m3Var3;
                                w3Var.f28545b = str23;
                                w3Var.f28546c = g0Var;
                                w3Var.f28547d = g0Var4;
                                w3Var.f28548e = b0Var2;
                                w3Var.f28549f = null;
                                w3Var.f28550g = null;
                                w3Var.f28551h = null;
                                w3Var.f28552j = null;
                                w3Var.f28553k = i18;
                                w3Var.f28556n = 3;
                                fVar.getClass();
                                wh.c cVar2 = ph.z0.f21632a;
                                objE = ph.h.e(wh.b.f31563c, new h8.g(fVar, x3Var, sVar, null), w3Var);
                                if (objE != aVar) {
                                }
                                if (objE != aVar) {
                                }
                            }
                        }
                        obj = "new";
                        str12 = str24;
                        str13 = str6;
                        i13 = i11;
                        str14 = str8;
                        str15 = str7;
                        list3 = list2;
                    }
                    l12 = l11;
                    str22 = null;
                    boolean z102 = ((b3) m3Var.f28312g.getValue()).f28114d;
                    String language2 = Locale.getDefault().getLanguage();
                    kotlin.jvm.internal.r.d(language2, "getLanguage(...)");
                    h8.s sVar2 = new h8.s(str15, str13, str12, str14, str22, list3, z102, language2);
                    z3 z3Var2 = new z3();
                    kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                    kotlin.jvm.internal.g0 g0Var32 = new kotlin.jvm.internal.g0();
                    kotlin.jvm.internal.g0 g0Var42 = new kotlin.jvm.internal.g0();
                    kotlin.jvm.internal.b0 b0Var22 = new kotlin.jvm.internal.b0();
                    h8.f fVar2 = m3Var.f28308c;
                    String str292 = str25;
                    m3 m3Var42 = m3Var;
                    x3 x3Var2 = new x3(m3Var42, g0Var32, str292, str5, l12, i13, z3Var2, f0Var2, b0Var22, g0Var42, null);
                    m3Var3 = m3Var42;
                    g0Var = g0Var32;
                    str23 = str292;
                    int i182 = i13;
                    w3Var.f28544a = m3Var3;
                    w3Var.f28545b = str23;
                    w3Var.f28546c = g0Var;
                    w3Var.f28547d = g0Var42;
                    w3Var.f28548e = b0Var22;
                    w3Var.f28549f = null;
                    w3Var.f28550g = null;
                    w3Var.f28551h = null;
                    w3Var.f28552j = null;
                    w3Var.f28553k = i182;
                    w3Var.f28556n = 3;
                    fVar2.getClass();
                    wh.c cVar22 = ph.z0.f21632a;
                    objE = ph.h.e(wh.b.f31563c, new h8.g(fVar2, x3Var2, sVar2, null), w3Var);
                    if (objE != aVar) {
                    }
                    if (objE != aVar) {
                    }
                }
                if (l10 != null) {
                    long jLongValue2 = l10.longValue();
                    w3Var.f28544a = this;
                    w3Var.f28545b = str24;
                    w3Var.f28546c = str25;
                    w3Var.f28547d = list;
                    w3Var.f28548e = l10;
                    w3Var.f28549f = str4;
                    w3Var.f28550g = str25;
                    w3Var.f28551h = str24;
                    w3Var.f28553k = i10;
                    w3Var.f28556n = 1;
                    Object objH = this.f28309d.h(jLongValue2, w3Var);
                    if (objH != aVar) {
                        list2 = list;
                        obj2 = objH;
                        str5 = str24;
                        m3Var2 = this;
                        str9 = str25;
                        str10 = str5;
                        i12 = i10;
                        str11 = str9;
                    }
                }
                i11 = i10;
                str5 = str24;
                m3Var = this;
                list2 = list;
                l11 = l10;
                str6 = str25;
            }
            str7 = str4;
            str8 = null;
            if (kotlin.jvm.internal.r.a(str25, "new")) {
            }
            l12 = l11;
            str22 = null;
            boolean z1022 = ((b3) m3Var.f28312g.getValue()).f28114d;
            String language22 = Locale.getDefault().getLanguage();
            kotlin.jvm.internal.r.d(language22, "getLanguage(...)");
            h8.s sVar22 = new h8.s(str15, str13, str12, str14, str22, list3, z1022, language22);
            z3 z3Var22 = new z3();
            kotlin.jvm.internal.f0 f0Var22 = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.g0 g0Var322 = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.g0 g0Var422 = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.b0 b0Var222 = new kotlin.jvm.internal.b0();
            h8.f fVar22 = m3Var.f28308c;
            String str2922 = str25;
            m3 m3Var422 = m3Var;
            x3 x3Var22 = new x3(m3Var422, g0Var322, str2922, str5, l12, i13, z3Var22, f0Var22, b0Var222, g0Var422, null);
            m3Var3 = m3Var422;
            g0Var = g0Var322;
            str23 = str2922;
            int i1822 = i13;
            w3Var.f28544a = m3Var3;
            w3Var.f28545b = str23;
            w3Var.f28546c = g0Var;
            w3Var.f28547d = g0Var422;
            w3Var.f28548e = b0Var222;
            w3Var.f28549f = null;
            w3Var.f28550g = null;
            w3Var.f28551h = null;
            w3Var.f28552j = null;
            w3Var.f28553k = i1822;
            w3Var.f28556n = 3;
            fVar22.getClass();
            wh.c cVar222 = ph.z0.f21632a;
            objE = ph.h.e(wh.b.f31563c, new h8.g(fVar22, x3Var22, sVar22, null), w3Var);
            if (objE != aVar) {
            }
            if (objE != aVar) {
            }
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4) {
                        pg.q.b(obj2);
                        return obj2;
                    }
                    if (i17 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj2);
                    return obj2;
                }
                i15 = w3Var.f28553k;
                b0Var = (kotlin.jvm.internal.b0) w3Var.f28548e;
                g0Var2 = (kotlin.jvm.internal.g0) w3Var.f28547d;
                g0Var = (kotlin.jvm.internal.g0) w3Var.f28546c;
                str23 = w3Var.f28545b;
                m3Var3 = w3Var.f28544a;
                try {
                    pg.q.b(obj2);
                    obj = "new";
                } catch (IOException e10) {
                    e = e10;
                    Object obj3 = "new";
                    String str30 = m3Var3.f28315j;
                    String str31 = (String) g0Var.f16327a;
                    if (str30 != null) {
                    }
                    throw new g8.a("ai_unavailable", e.getMessage(), e);
                }
                if (!b0Var.f16318a) {
                    String str32 = m3Var3.f28315j;
                    String str33 = (String) g0Var.f16327a;
                    if (str32 != null && str33 != null) {
                        boolean z11 = !kotlin.jvm.internal.r.a(str23, obj);
                        w3Var.f28544a = null;
                        w3Var.f28545b = null;
                        w3Var.f28546c = null;
                        w3Var.f28547d = null;
                        w3Var.f28548e = null;
                        w3Var.f28556n = 5;
                        Object objK = m3Var3.k(i15, str32, str33, z11, w3Var);
                        return objK == aVar ? aVar : objK;
                    }
                    m3Var3.o(i15, new i3(0));
                }
                return g0Var2.f16327a;
            }
            i14 = w3Var.f28553k;
            str17 = w3Var.f28552j;
            str21 = w3Var.f28551h;
            str20 = w3Var.f28550g;
            str18 = w3Var.f28549f;
            l11 = (Long) w3Var.f28548e;
            list4 = (List) w3Var.f28547d;
            str16 = (String) w3Var.f28546c;
            str19 = w3Var.f28545b;
            m3Var = w3Var.f28544a;
            pg.q.b(obj2);
            obj = "new";
            i13 = i14;
            str14 = str17;
            str22 = (String) obj2;
            str12 = str21;
            str25 = str16;
            list3 = list4;
            str13 = str20;
            str15 = str18;
            l12 = l11;
            str5 = str19;
            boolean z10222 = ((b3) m3Var.f28312g.getValue()).f28114d;
            String language222 = Locale.getDefault().getLanguage();
            kotlin.jvm.internal.r.d(language222, "getLanguage(...)");
            h8.s sVar222 = new h8.s(str15, str13, str12, str14, str22, list3, z10222, language222);
            z3 z3Var222 = new z3();
            kotlin.jvm.internal.f0 f0Var222 = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.g0 g0Var3222 = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.g0 g0Var4222 = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.b0 b0Var2222 = new kotlin.jvm.internal.b0();
            h8.f fVar222 = m3Var.f28308c;
            String str29222 = str25;
            m3 m3Var4222 = m3Var;
            x3 x3Var222 = new x3(m3Var4222, g0Var3222, str29222, str5, l12, i13, z3Var222, f0Var222, b0Var2222, g0Var4222, null);
            m3Var3 = m3Var4222;
            g0Var = g0Var3222;
            str23 = str29222;
            int i18222 = i13;
            w3Var.f28544a = m3Var3;
            w3Var.f28545b = str23;
            w3Var.f28546c = g0Var;
            w3Var.f28547d = g0Var4222;
            w3Var.f28548e = b0Var2222;
            w3Var.f28549f = null;
            w3Var.f28550g = null;
            w3Var.f28551h = null;
            w3Var.f28552j = null;
            w3Var.f28553k = i18222;
            w3Var.f28556n = 3;
            fVar222.getClass();
            wh.c cVar2222 = ph.z0.f21632a;
            objE = ph.h.e(wh.b.f31563c, new h8.g(fVar222, x3Var222, sVar222, null), w3Var);
            if (objE != aVar) {
                objE = pg.f0.f21461a;
            }
            if (objE != aVar) {
                b0Var = b0Var2222;
                i15 = i18222;
                g0Var2 = g0Var4222;
                if (!b0Var.f16318a) {
                }
                return g0Var2.f16327a;
            }
        }
        i12 = w3Var.f28553k;
        str10 = w3Var.f28551h;
        str11 = w3Var.f28550g;
        str4 = w3Var.f28549f;
        l10 = (Long) w3Var.f28548e;
        list2 = (List) w3Var.f28547d;
        str9 = (String) w3Var.f28546c;
        str5 = w3Var.f28545b;
        m3Var2 = w3Var.f28544a;
        pg.q.b(obj2);
        String str34 = str11;
        i11 = i12;
        str24 = str10;
        str25 = str9;
        m3Var = m3Var2;
        l11 = l10;
        str7 = str4;
        str8 = (String) obj2;
        str6 = str34;
        if (kotlin.jvm.internal.r.a(str25, "new")) {
        }
        l12 = l11;
        str22 = null;
        boolean z102222 = ((b3) m3Var.f28312g.getValue()).f28114d;
        String language2222 = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.r.d(language2222, "getLanguage(...)");
        h8.s sVar2222 = new h8.s(str15, str13, str12, str14, str22, list3, z102222, language2222);
        z3 z3Var2222 = new z3();
        kotlin.jvm.internal.f0 f0Var2222 = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.g0 g0Var32222 = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.g0 g0Var42222 = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.b0 b0Var22222 = new kotlin.jvm.internal.b0();
        h8.f fVar2222 = m3Var.f28308c;
        String str292222 = str25;
        m3 m3Var42222 = m3Var;
        x3 x3Var2222 = new x3(m3Var42222, g0Var32222, str292222, str5, l12, i13, z3Var2222, f0Var2222, b0Var22222, g0Var42222, null);
        m3Var3 = m3Var42222;
        g0Var = g0Var32222;
        str23 = str292222;
        int i182222 = i13;
        w3Var.f28544a = m3Var3;
        w3Var.f28545b = str23;
        w3Var.f28546c = g0Var;
        w3Var.f28547d = g0Var42222;
        w3Var.f28548e = b0Var22222;
        w3Var.f28549f = null;
        w3Var.f28550g = null;
        w3Var.f28551h = null;
        w3Var.f28552j = null;
        w3Var.f28553k = i182222;
        w3Var.f28556n = 3;
        fVar2222.getClass();
        wh.c cVar22222 = ph.z0.f21632a;
        objE = ph.h.e(wh.b.f31563c, new h8.g(fVar2222, x3Var2222, sVar2222, null), w3Var);
        if (objE != aVar) {
        }
        if (objE != aVar) {
        }
    }

    public final void o(int i10, eh.l<? super y3, y3> lVar) {
        sh.z0 z0Var;
        Object value;
        b3 b3Var;
        ArrayList arrayList;
        do {
            z0Var = this.f28312g;
            value = z0Var.getValue();
            b3Var = (b3) value;
            List<y3> list = b3Var.f28111a;
            arrayList = new ArrayList(qg.p.h(list, 10));
            for (y3 y3VarInvoke : list) {
                if (y3VarInvoke.f28581a == i10) {
                    y3VarInvoke = lVar.invoke(y3VarInvoke);
                }
                arrayList.add(y3VarInvoke);
            }
        } while (!z0Var.a(value, b3.a(b3Var, arrayList, null, null, false, false, false, null, 254)));
    }
}
