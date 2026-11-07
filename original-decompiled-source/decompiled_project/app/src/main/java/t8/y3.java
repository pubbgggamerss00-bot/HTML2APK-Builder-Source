package t8;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28582b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28583c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28584d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28585e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f28586f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28587g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28588h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f28589i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28590j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f28591k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f28592l;

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, Set<String>> f28593m;

    /* renamed from: n, reason: collision with root package name */
    public final List<String> f28594n;

    /* renamed from: o, reason: collision with root package name */
    public final List<String> f28595o;

    /* renamed from: p, reason: collision with root package name */
    public final h8.u f28596p;

    /* renamed from: q, reason: collision with root package name */
    public final int f28597q;

    /* renamed from: r, reason: collision with root package name */
    public final String f28598r;

    /* renamed from: s, reason: collision with root package name */
    public final String f28599s;

    /* renamed from: t, reason: collision with root package name */
    public final String f28600t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f28601u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f28602v;

    /* JADX WARN: Multi-variable type inference failed */
    public y3(int i10, String str, boolean z10, String text, String str2, Integer num, long j10, String str3, List<String> code, boolean z11, Integer num2, boolean z12, Map<String, ? extends Set<String>> map, List<String> list, List<String> list2, h8.u uVar, int i11, String str4, String str5, String str6, boolean z13, boolean z14) {
        kotlin.jvm.internal.r.e(text, "text");
        kotlin.jvm.internal.r.e(code, "code");
        this.f28581a = i10;
        this.f28582b = str;
        this.f28583c = z10;
        this.f28584d = text;
        this.f28585e = str2;
        this.f28586f = num;
        this.f28587g = j10;
        this.f28588h = str3;
        this.f28589i = code;
        this.f28590j = z11;
        this.f28591k = num2;
        this.f28592l = z12;
        this.f28593m = map;
        this.f28594n = list;
        this.f28595o = list2;
        this.f28596p = uVar;
        this.f28597q = i11;
        this.f28598r = str4;
        this.f28599s = str5;
        this.f28600t = str6;
        this.f28601u = z13;
        this.f28602v = z14;
    }

    public static y3 a(y3 y3Var, String str, String str2, Integer num, String str3, List list, Integer num2, boolean z10, LinkedHashMap linkedHashMap, List list2, ArrayList arrayList, h8.u uVar, int i10, String str4, String str5, String str6, int i11) {
        int i12 = y3Var.f28581a;
        String prompt = y3Var.f28582b;
        boolean z11 = y3Var.f28583c;
        String text = (i11 & 8) != 0 ? y3Var.f28584d : str;
        String thinking = (i11 & 16) != 0 ? y3Var.f28585e : str2;
        Integer num3 = (i11 & 32) != 0 ? y3Var.f28586f : num;
        long j10 = y3Var.f28587g;
        String str7 = (i11 & 128) != 0 ? y3Var.f28588h : str3;
        List code = (i11 & 256) != 0 ? y3Var.f28589i : list;
        boolean z12 = (i11 & 512) != 0 ? y3Var.f28590j : false;
        Integer num4 = (i11 & 1024) != 0 ? y3Var.f28591k : num2;
        boolean z13 = (i11 & 2048) != 0 ? y3Var.f28592l : z10;
        Map<String, Set<String>> autoPermissions = (i11 & 4096) != 0 ? y3Var.f28593m : linkedHashMap;
        List dropped = (i11 & 8192) != 0 ? y3Var.f28594n : list2;
        List<String> changes = (i11 & 16384) != 0 ? y3Var.f28595o : arrayList;
        h8.u uVar2 = (i11 & 32768) != 0 ? y3Var.f28596p : uVar;
        int i13 = (i11 & 65536) != 0 ? y3Var.f28597q : i10;
        String str8 = (i11 & 131072) != 0 ? y3Var.f28598r : str4;
        String str9 = (i11 & PKIFailureInfo.transactionIdInUse) != 0 ? y3Var.f28599s : str5;
        String str10 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? y3Var.f28600t : str6;
        boolean z14 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? y3Var.f28601u : true;
        boolean z15 = y3Var.f28602v;
        y3Var.getClass();
        kotlin.jvm.internal.r.e(prompt, "prompt");
        kotlin.jvm.internal.r.e(text, "text");
        kotlin.jvm.internal.r.e(thinking, "thinking");
        kotlin.jvm.internal.r.e(code, "code");
        kotlin.jvm.internal.r.e(autoPermissions, "autoPermissions");
        kotlin.jvm.internal.r.e(dropped, "dropped");
        kotlin.jvm.internal.r.e(changes, "changes");
        return new y3(i12, prompt, z11, text, thinking, num3, j10, str7, code, z12, num4, z13, autoPermissions, dropped, changes, uVar2, i13, str8, str9, str10, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return this.f28581a == y3Var.f28581a && kotlin.jvm.internal.r.a(this.f28582b, y3Var.f28582b) && this.f28583c == y3Var.f28583c && kotlin.jvm.internal.r.a(this.f28584d, y3Var.f28584d) && kotlin.jvm.internal.r.a(this.f28585e, y3Var.f28585e) && kotlin.jvm.internal.r.a(this.f28586f, y3Var.f28586f) && this.f28587g == y3Var.f28587g && kotlin.jvm.internal.r.a(this.f28588h, y3Var.f28588h) && kotlin.jvm.internal.r.a(this.f28589i, y3Var.f28589i) && this.f28590j == y3Var.f28590j && kotlin.jvm.internal.r.a(this.f28591k, y3Var.f28591k) && this.f28592l == y3Var.f28592l && kotlin.jvm.internal.r.a(this.f28593m, y3Var.f28593m) && kotlin.jvm.internal.r.a(this.f28594n, y3Var.f28594n) && kotlin.jvm.internal.r.a(this.f28595o, y3Var.f28595o) && kotlin.jvm.internal.r.a(this.f28596p, y3Var.f28596p) && this.f28597q == y3Var.f28597q && kotlin.jvm.internal.r.a(this.f28598r, y3Var.f28598r) && kotlin.jvm.internal.r.a(this.f28599s, y3Var.f28599s) && kotlin.jvm.internal.r.a(this.f28600t, y3Var.f28600t) && this.f28601u == y3Var.f28601u && this.f28602v == y3Var.f28602v;
    }

    public final int hashCode() {
        int iA = l0.k.a(l0.k.a(r.o2.a(l0.k.a(Integer.hashCode(this.f28581a) * 31, 31, this.f28582b), 31, this.f28583c), 31, this.f28584d), 31, this.f28585e);
        Integer num = this.f28586f;
        int iA2 = r.e2.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.f28587g);
        String str = this.f28588h;
        int iA3 = r.o2.a(a2.a.a(this.f28589i, (iA2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f28590j);
        Integer num2 = this.f28591k;
        int iA4 = a2.a.a(this.f28595o, a2.a.a(this.f28594n, (this.f28593m.hashCode() + r.o2.a((iA3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f28592l)) * 31, 31), 31);
        h8.u uVar = this.f28596p;
        int iA5 = androidx.datastore.preferences.protobuf.a1.a(this.f28597q, (iA4 + (uVar == null ? 0 : uVar.hashCode())) * 31, 31);
        String str2 = this.f28598r;
        int iHashCode = (iA5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28599s;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28600t;
        return Boolean.hashCode(this.f28602v) + r.o2.a((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f28601u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiTurnUi(id=");
        sb.append(this.f28581a);
        sb.append(", prompt=");
        sb.append(this.f28582b);
        sb.append(", isEdit=");
        sb.append(this.f28583c);
        sb.append(", text=");
        sb.append(this.f28584d);
        sb.append(", thinking=");
        sb.append(this.f28585e);
        sb.append(", thinkingSeconds=");
        sb.append(this.f28586f);
        sb.append(", startedAt=");
        sb.append(this.f28587g);
        sb.append(", phase=");
        sb.append(this.f28588h);
        sb.append(", code=");
        sb.append(this.f28589i);
        sb.append(", running=");
        sb.append(this.f28590j);
        sb.append(", credits=");
        sb.append(this.f28591k);
        sb.append(", free=");
        sb.append(this.f28592l);
        sb.append(", autoPermissions=");
        sb.append(this.f28593m);
        sb.append(", dropped=");
        sb.append(this.f28594n);
        sb.append(", changes=");
        sb.append(this.f28595o);
        sb.append(", pendingSettings=");
        sb.append(this.f28596p);
        sb.append(", failedBlocks=");
        sb.append(this.f28597q);
        sb.append(", errorCode=");
        sb.append(this.f28598r);
        androidx.room.z0.a(sb, ", serverSessionId=", this.f28599s, ", serverTurnId=", this.f28600t);
        sb.append(", reported=");
        sb.append(this.f28601u);
        sb.append(", fromHistory=");
        sb.append(this.f28602v);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(int i10, String str, boolean z10, String str2, List list, Integer num, boolean z11, String str3, String str4, String str5, int i11) {
        String str6 = (i11 & 8) != 0 ? "" : str2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str7 = (i11 & 128) != 0 ? "planning" : null;
        int i12 = i11 & 256;
        qg.z zVar = qg.z.f22752a;
        this(i10, str, z10, str6, "", null, jElapsedRealtime, str7, i12 != 0 ? zVar : list, (i11 & 512) != 0, (i11 & 1024) != 0 ? null : num, (i11 & 2048) != 0 ? false : z11, qg.a0.f22708a, zVar, zVar, null, 0, (131072 & i11) != 0 ? null : str3, (262144 & i11) != 0 ? null : str4, (524288 & i11) != 0 ? null : str5, false, (i11 & PKIFailureInfo.badSenderNonce) == 0);
    }
}
