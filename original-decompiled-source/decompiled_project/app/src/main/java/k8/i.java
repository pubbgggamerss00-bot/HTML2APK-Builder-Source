package k8;

import androidx.datastore.preferences.protobuf.a1;
import h1.y;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import qg.a0;
import qg.b0;
import r.e2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f16120a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16121b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16122c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16124e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16125f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16126g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16127h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16128i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16129j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Integer> f16130k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, Integer> f16131l;

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, Integer> f16132m;

    /* renamed from: n, reason: collision with root package name */
    public final Map<String, Integer> f16133n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<String> f16134o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16135p;

    public i() {
        this(0);
    }

    public static i a(i iVar, long j10, long j11, int i10, long j12, int i11, long j13, int i12, int i13, long j14, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashSet linkedHashSet, int i14) {
        long j15 = (i14 & 1) != 0 ? iVar.f16120a : j10;
        long j16 = (i14 & 2) != 0 ? iVar.f16121b : j11;
        int i15 = (i14 & 4) != 0 ? iVar.f16122c : i10;
        long j17 = (i14 & 8) != 0 ? iVar.f16123d : j12;
        int i16 = (i14 & 16) != 0 ? iVar.f16124e : i11;
        long j18 = (i14 & 32) != 0 ? iVar.f16125f : j13;
        int i17 = (i14 & 64) != 0 ? iVar.f16126g : i12;
        int i18 = (i14 & 128) != 0 ? iVar.f16127h : i13;
        long j19 = (i14 & 256) != 0 ? iVar.f16128i : j14;
        long j20 = iVar.f16129j;
        Map<String, Integer> catCounts = (i14 & 1024) != 0 ? iVar.f16130k : linkedHashMap;
        Map<String, Integer> catLevels = (i14 & 2048) != 0 ? iVar.f16131l : linkedHashMap2;
        Map<String, Integer> workerCounts = (i14 & 4096) != 0 ? iVar.f16132m : linkedHashMap3;
        long j21 = j15;
        Map<String, Integer> buildingLevels = (i14 & 8192) != 0 ? iVar.f16133n : linkedHashMap4;
        Set<String> claimedQuests = (i14 & 16384) != 0 ? iVar.f16134o : linkedHashSet;
        boolean z10 = (i14 & 32768) != 0 ? iVar.f16135p : true;
        iVar.getClass();
        r.e(catCounts, "catCounts");
        r.e(catLevels, "catLevels");
        r.e(workerCounts, "workerCounts");
        r.e(buildingLevels, "buildingLevels");
        r.e(claimedQuests, "claimedQuests");
        return new i(j21, j16, i15, j17, i16, j18, i17, i18, j19, j20, catCounts, catLevels, workerCounts, buildingLevels, claimedQuests, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16120a == iVar.f16120a && this.f16121b == iVar.f16121b && this.f16122c == iVar.f16122c && this.f16123d == iVar.f16123d && this.f16124e == iVar.f16124e && this.f16125f == iVar.f16125f && this.f16126g == iVar.f16126g && this.f16127h == iVar.f16127h && this.f16128i == iVar.f16128i && this.f16129j == iVar.f16129j && r.a(this.f16130k, iVar.f16130k) && r.a(this.f16131l, iVar.f16131l) && r.a(this.f16132m, iVar.f16132m) && r.a(this.f16133n, iVar.f16133n) && r.a(this.f16134o, iVar.f16134o) && this.f16135p == iVar.f16135p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16135p) + ((this.f16134o.hashCode() + ((this.f16133n.hashCode() + ((this.f16132m.hashCode() + ((this.f16131l.hashCode() + ((this.f16130k.hashCode() + e2.a(e2.a(a1.a(this.f16127h, a1.a(this.f16126g, e2.a(a1.a(this.f16124e, e2.a(a1.a(this.f16122c, e2.a(Long.hashCode(this.f16120a) * 31, 31, this.f16121b), 31), 31, this.f16123d), 31), 31, this.f16125f), 31), 31), 31, this.f16128i), 31, this.f16129j)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = y.a("CatGameState(paws=", ", hearts=", this.f16120a);
        sbA.append(this.f16121b);
        sbA.append(", tuna=");
        sbA.append(this.f16122c);
        sbA.append(", totalPawsEarned=");
        sbA.append(this.f16123d);
        sbA.append(", totalClicks=");
        sbA.append(this.f16124e);
        sbA.append(", totalHearts=");
        sbA.append(this.f16125f);
        sbA.append(", totalEvents=");
        sbA.append(this.f16126g);
        sbA.append(", farmLevel=");
        sbA.append(this.f16127h);
        sbA.append(", farmXp=");
        sbA.append(this.f16128i);
        sbA.append(", lastActiveTimestamp=");
        sbA.append(this.f16129j);
        sbA.append(", catCounts=");
        sbA.append(this.f16130k);
        sbA.append(", catLevels=");
        sbA.append(this.f16131l);
        sbA.append(", workerCounts=");
        sbA.append(this.f16132m);
        sbA.append(", buildingLevels=");
        sbA.append(this.f16133n);
        sbA.append(", claimedQuests=");
        sbA.append(this.f16134o);
        sbA.append(", hasMembership=");
        sbA.append(this.f16135p);
        sbA.append(")");
        return sbA.toString();
    }

    public i(long j10, long j11, int i10, long j12, int i11, long j13, int i12, int i13, long j14, long j15, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3, Map<String, Integer> map4, Set<String> set, boolean z10) {
        this.f16120a = j10;
        this.f16121b = j11;
        this.f16122c = i10;
        this.f16123d = j12;
        this.f16124e = i11;
        this.f16125f = j13;
        this.f16126g = i12;
        this.f16127h = i13;
        this.f16128i = j14;
        this.f16129j = j15;
        this.f16130k = map;
        this.f16131l = map2;
        this.f16132m = map3;
        this.f16133n = map4;
        this.f16134o = set;
        this.f16135p = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        b0 b0Var = b0.f22711a;
        a0 a0Var = a0.f22708a;
        this(0L, 0L, 10, 0L, 0, 0L, 0, 1, 0L, jCurrentTimeMillis, a0Var, a0Var, a0Var, a0Var, b0Var, false);
    }
}
