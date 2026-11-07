package h8;

import f9.oe;
import h8.v;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlinx.serialization.json.x;
import mh.y;
import org.bouncycastle.asn1.x509.DisplayText;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import pg.p;
import ph.b1;
import ph.i0;
import ph.s1;
import ph.v1;
import t8.x3;

@vg.e(c = "com.basitce.htmltoapk.ai.AiClient$generate$2", f = "AiClient.kt", l = {72, 73, 93, HeaderItem.DATA_SIZE_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f12390a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12391b;

    /* renamed from: c, reason: collision with root package name */
    public f f12392c;

    /* renamed from: d, reason: collision with root package name */
    public s f12393d;

    /* renamed from: e, reason: collision with root package name */
    public eh.p f12394e;

    /* renamed from: f, reason: collision with root package name */
    public BufferedReader f12395f;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f12396g;

    /* renamed from: h, reason: collision with root package name */
    public int f12397h;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f12398j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f12399k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x3 f12400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f12401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, x3 x3Var, s sVar, tg.e eVar) {
        super(2, eVar);
        this.f12399k = fVar;
        this.f12400l = x3Var;
        this.f12401m = sVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        g gVar = new g(this.f12399k, this.f12400l, this.f12401m, eVar);
        gVar.f12398j = obj;
        return gVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:24:0x008c, B:29:0x00a0], limit reached: 163 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024d A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:55:0x0180, B:42:0x012e, B:44:0x0148, B:49:0x0159, B:103:0x0247, B:105:0x024d, B:119:0x028c, B:122:0x0291, B:128:0x029e, B:118:0x0288, B:141:0x02c9, B:142:0x02cc, B:43:0x0132, B:110:0x0264, B:112:0x0278, B:115:0x0282, B:139:0x02c7), top: B:165:0x012e, inners: #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0278 A[Catch: all -> 0x0287, TryCatch #3 {all -> 0x0287, blocks: (B:110:0x0264, B:112:0x0278, B:115:0x0282), top: B:155:0x0264, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #1 {all -> 0x0193, blocks: (B:80:0x01ed, B:52:0x0171, B:54:0x017e, B:66:0x0198, B:68:0x019e, B:70:0x01a4, B:72:0x01bf, B:82:0x01f7, B:84:0x0202, B:86:0x0208, B:88:0x0218, B:90:0x021f, B:92:0x0225, B:93:0x022a), top: B:151:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198 A[Catch: all -> 0x0193, TRY_ENTER, TryCatch #1 {all -> 0x0193, blocks: (B:80:0x01ed, B:52:0x0171, B:54:0x017e, B:66:0x0198, B:68:0x019e, B:70:0x01a4, B:72:0x01bf, B:82:0x01f7, B:84:0x0202, B:86:0x0208, B:88:0x0218, B:90:0x021f, B:92:0x0225, B:93:0x022a), top: B:151:0x01ed }] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [eh.p] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01da -> B:76:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0214 -> B:81:0x01f4). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        i0 i0Var;
        String strD;
        Object objG;
        String str;
        Object objB;
        String str2;
        String str3;
        HttpURLConnection httpURLConnection;
        b1 b1VarInvokeOnCompletion;
        HttpURLConnection httpURLConnection2;
        Charset charset;
        int responseCode;
        x3 x3Var;
        String strD2;
        Object objA;
        String str4;
        v.c cVar;
        b1 b1Var;
        kotlinx.serialization.json.h hVar;
        Throwable th2;
        Closeable closeable;
        String string;
        s sVar;
        StringBuilder sb;
        ?? r82;
        HttpURLConnection httpURLConnection3;
        String line;
        s sVar2 = this.f12401m;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12397h;
        String str5 = "message";
        f fVar = this.f12399k;
        Throwable th3 = null;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (i0) this.f12398j;
            id.e eVar = fVar.f12383a.f11598b;
            if (eVar != null) {
                eVar.a();
                id.l lVar = eVar.f14482c;
                if (lVar != null && (str = lVar.f14498g) != null) {
                    strD = i8.n.d("https://europe-west1-", str, ".cloudfunctions.net/generate");
                }
                if (strD != null) {
                    throw new g8.a(6, "not_configured", (String) null);
                }
                g8.p pVar = fVar.f12383a;
                this.f12398j = i0Var;
                this.f12390a = strD;
                this.f12397h = 1;
                objG = pVar.g(this);
                if (objG != aVar) {
                }
                return aVar;
            }
            strD = null;
            if (strD != null) {
            }
        } else if (i10 == 1) {
            strD = (String) this.f12390a;
            i0Var = (i0) this.f12398j;
            pg.q.b(obj);
            objG = obj;
        } else if (i10 == 2) {
            str3 = (String) this.f12391b;
            String str6 = (String) this.f12390a;
            pg.q.b(obj);
            str2 = str6;
            objB = obj;
            URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
            kotlin.jvm.internal.r.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(180000);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "text/event-stream");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str3);
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", (String) objB);
            s1 s1Var = (s1) getContext().get(s1.a.f21589a);
            b1VarInvokeOnCompletion = s1Var == null ? s1Var.invokeOnCompletion(new oe(httpURLConnection, 1)) : null;
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    String strA = f.a(fVar, sVar2);
                    charset = mh.a.f18238b;
                    byte[] bytes = strA.getBytes(charset);
                    kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    f0 f0Var = f0.f21461a;
                    outputStream.close();
                    responseCode = httpURLConnection.getResponseCode();
                    x3Var = this.f12400l;
                    if (200 <= responseCode || responseCode >= 300) {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        strD2 = errorStream == null ? ah.p.d(new BufferedReader(new InputStreamReader(errorStream, charset), 8192)) : null;
                        if (strD2 == null) {
                            strD2 = "";
                        }
                        String str7 = strD2;
                        try {
                            hVar = (kotlinx.serialization.json.h) kotlinx.serialization.json.i.e(fVar.f12384b.d(str7)).get("code");
                        } catch (Throwable th4) {
                            objA = pg.q.a(th4);
                        }
                        if (hVar != null) {
                            x xVarF = kotlinx.serialization.json.i.f(hVar);
                            if (!(xVarF instanceof kotlinx.serialization.json.t)) {
                                objA = xVarF.c();
                            }
                            if (objA instanceof p.a) {
                                objA = null;
                            }
                            str4 = (String) objA;
                            if (str4 == null) {
                                str4 = responseCode == 401 ? "not_signed_in" : "ai_unavailable";
                            }
                            cVar = new v.c(str4, y.b0(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, str7));
                            this.f12398j = httpURLConnection;
                            this.f12390a = b1VarInvokeOnCompletion;
                            this.f12391b = null;
                            this.f12397h = 3;
                            if (x3Var.invoke(cVar, this) != aVar) {
                                httpURLConnection2 = httpURLConnection;
                                b1Var = b1VarInvokeOnCompletion;
                                f0 f0Var2 = f0.f21461a;
                                if (b1Var != null) {
                                }
                                httpURLConnection2.disconnect();
                                return f0Var2;
                            }
                            return aVar;
                        }
                        objA = null;
                        if (objA instanceof p.a) {
                        }
                        str4 = (String) objA;
                        if (str4 == null) {
                        }
                        cVar = new v.c(str4, y.b0(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, str7));
                        this.f12398j = httpURLConnection;
                        this.f12390a = b1VarInvokeOnCompletion;
                        this.f12391b = null;
                        this.f12397h = 3;
                        if (x3Var.invoke(cVar, this) != aVar) {
                        }
                        return aVar;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset));
                    try {
                        closeable = bufferedReader;
                        string = "message";
                        sVar = sVar2;
                        sb = new StringBuilder();
                        r82 = closeable;
                        v1.e(getContext());
                        line = r82.readLine();
                        if (line == null) {
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        closeable = bufferedReader;
                        httpURLConnection3 = httpURLConnection;
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection2 = httpURLConnection;
                b1Var = b1VarInvokeOnCompletion;
                if (b1Var != null) {
                }
                httpURLConnection2.disconnect();
                throw th;
            }
        } else {
            if (i10 == 3) {
                b1Var = (b1) this.f12390a;
                httpURLConnection2 = (HttpURLConnection) this.f12398j;
                try {
                    pg.q.b(obj);
                    f0 f0Var22 = f0.f21461a;
                    if (b1Var != null) {
                        b1Var.a();
                    }
                    httpURLConnection2.disconnect();
                    return f0Var22;
                } catch (Throwable th7) {
                    th = th7;
                    if (b1Var != null) {
                    }
                    httpURLConnection2.disconnect();
                    throw th;
                }
            }
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = this.f12396g;
            BufferedReader bufferedReader2 = this.f12395f;
            ?? r83 = this.f12394e;
            s sVar3 = this.f12393d;
            fVar = this.f12392c;
            closeable = (Closeable) this.f12391b;
            b1VarInvokeOnCompletion = (b1) this.f12390a;
            httpURLConnection3 = (HttpURLConnection) this.f12398j;
            try {
                pg.q.b(obj);
                String str8 = "message";
                char c10 = 4;
                x3 x3Var2 = r83;
                try {
                    x3 x3Var3 = x3Var2;
                    r82 = bufferedReader2;
                    sVar = sVar3;
                    httpURLConnection = httpURLConnection3;
                    x3Var = x3Var3;
                    sb.setLength(0);
                    str5 = str8;
                    string = str5;
                    boolean z10 = r82;
                    th3 = null;
                    r82 = z10;
                    v1.e(getContext());
                    line = r82.readLine();
                    if (line == null) {
                        if (line.length() != 0) {
                            String str9 = str5;
                            if (!mh.t.p(line, ":", false)) {
                                if (mh.t.p(line, "event:", false)) {
                                    string = mh.x.W(mh.x.I(line, "event:")).toString();
                                } else if (mh.t.p(line, "data:", false)) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(mh.x.I(mh.x.I(line, "data:"), " "));
                                }
                            }
                            str5 = str9;
                            z10 = r82;
                            th3 = null;
                            r82 = z10;
                            v1.e(getContext());
                            line = r82.readLine();
                            if (line == null) {
                                f0 f0Var3 = f0.f21461a;
                                ah.c.a(closeable, th3);
                                if (b1VarInvokeOnCompletion != null) {
                                    b1VarInvokeOnCompletion.a();
                                }
                                httpURLConnection.disconnect();
                                return f0.f21461a;
                            }
                        } else {
                            if (sb.length() > 0) {
                                String string2 = sb.toString();
                                kotlin.jvm.internal.r.d(string2, "toString(...)");
                                str8 = str5;
                                v vVarB = f.b(fVar, string, string2, !kotlin.jvm.internal.r.a(sVar.f12448b, "new"));
                                if (vVarB != null) {
                                    this.f12398j = httpURLConnection;
                                    this.f12390a = b1VarInvokeOnCompletion;
                                    this.f12391b = closeable;
                                    this.f12392c = fVar;
                                    this.f12393d = sVar;
                                    this.f12394e = x3Var;
                                    this.f12395f = r82;
                                    this.f12396g = sb;
                                    c10 = 4;
                                    this.f12397h = 4;
                                    if (x3Var.invoke(vVarB, this) == aVar) {
                                        return aVar;
                                    }
                                    HttpURLConnection httpURLConnection4 = httpURLConnection;
                                    sVar3 = sVar;
                                    bufferedReader2 = r82;
                                    x3Var2 = x3Var;
                                    httpURLConnection3 = httpURLConnection4;
                                    x3 x3Var32 = x3Var2;
                                    r82 = bufferedReader2;
                                    sVar = sVar3;
                                    httpURLConnection = httpURLConnection3;
                                    x3Var = x3Var32;
                                } else {
                                    c10 = 4;
                                }
                            } else {
                                str8 = str5;
                                c10 = 4;
                            }
                            sb.setLength(0);
                            str5 = str8;
                            string = str5;
                            boolean z102 = r82;
                            th3 = null;
                            r82 = z102;
                            v1.e(getContext());
                            line = r82.readLine();
                            if (line == null) {
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    httpURLConnection3 = httpURLConnection;
                    try {
                        throw th2;
                    } catch (Throwable th9) {
                        try {
                            ah.c.a(closeable, th2);
                            throw th9;
                        } catch (Throwable th10) {
                            th = th10;
                            httpURLConnection2 = httpURLConnection3;
                            b1Var = b1VarInvokeOnCompletion;
                            if (b1Var != null) {
                                b1Var.a();
                            }
                            httpURLConnection2.disconnect();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th11) {
                th2 = th11;
                throw th2;
            }
        }
        String str10 = (String) objG;
        g8.p pVar2 = fVar.f12383a;
        this.f12398j = i0Var;
        this.f12390a = strD;
        this.f12391b = str10;
        this.f12397h = 2;
        objB = pVar2.b(this);
        if (objB != aVar) {
            str2 = strD;
            str3 = str10;
            URLConnection uRLConnectionOpenConnection2 = new URL(str2).openConnection();
            kotlin.jvm.internal.r.c(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(180000);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "text/event-stream");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str3);
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", (String) objB);
            s1 s1Var2 = (s1) getContext().get(s1.a.f21589a);
            if (s1Var2 == null) {
            }
            OutputStream outputStream2 = httpURLConnection.getOutputStream();
            String strA2 = f.a(fVar, sVar2);
            charset = mh.a.f18238b;
            byte[] bytes2 = strA2.getBytes(charset);
            kotlin.jvm.internal.r.d(bytes2, "getBytes(...)");
            outputStream2.write(bytes2);
            f0 f0Var4 = f0.f21461a;
            outputStream2.close();
            responseCode = httpURLConnection.getResponseCode();
            x3Var = this.f12400l;
            if (200 <= responseCode) {
            }
            InputStream errorStream2 = httpURLConnection.getErrorStream();
            if (errorStream2 == null) {
            }
            if (strD2 == null) {
            }
            String str72 = strD2;
            hVar = (kotlinx.serialization.json.h) kotlinx.serialization.json.i.e(fVar.f12384b.d(str72)).get("code");
            if (hVar != null) {
            }
            objA = null;
            if (objA instanceof p.a) {
            }
            str4 = (String) objA;
            if (str4 == null) {
            }
            cVar = new v.c(str4, y.b0(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, str72));
            this.f12398j = httpURLConnection;
            this.f12390a = b1VarInvokeOnCompletion;
            this.f12391b = null;
            this.f12397h = 3;
            if (x3Var.invoke(cVar, this) != aVar) {
            }
        }
        return aVar;
    }
}
