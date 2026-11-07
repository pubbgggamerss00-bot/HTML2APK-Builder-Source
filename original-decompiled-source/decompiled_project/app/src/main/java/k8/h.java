package k8;

import android.content.SharedPreferences;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import mh.x;
import org.json.JSONException;
import org.json.JSONObject;
import ph.j0;
import qg.a0;
import qg.b0;
import qg.p;
import sh.a1;
import sh.l0;
import sh.z0;
import tg.h;

/* loaded from: classes.dex */
public final class h {
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public final i8.j f16094a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16095b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f16096c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f16097d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f16098e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f16099f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f16100g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f16101h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f16102i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f16103j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f16104k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f16105l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f16106m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f16107n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f16108o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f16109p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f16110q;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f16111r;

    /* renamed from: s, reason: collision with root package name */
    public final z0 f16112s;

    /* renamed from: t, reason: collision with root package name */
    public final l0 f16113t;

    /* renamed from: u, reason: collision with root package name */
    public long f16114u;

    /* renamed from: v, reason: collision with root package name */
    public long f16115v;

    /* renamed from: w, reason: collision with root package name */
    public long f16116w;

    /* renamed from: x, reason: collision with root package name */
    public long f16117x;

    /* renamed from: y, reason: collision with root package name */
    public long f16118y;

    /* renamed from: z, reason: collision with root package name */
    public long f16119z;

    public h(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, i8.j billingManager) {
        r.e(billingManager, "billingManager");
        this.f16094a = billingManager;
        uh.c cVarA = j0.a(h.a.C0291a.c(ah.l.a(), ph.z0.f21632a));
        SharedPreferences sharedPreferences = hilt_HtmlToApkApplication.getSharedPreferences("cat_game_prefs", 0);
        r.d(sharedPreferences, "getSharedPreferences(...)");
        this.f16095b = sharedPreferences;
        z0 z0VarA = a1.a(new i(0));
        this.f16096c = z0VarA;
        this.f16097d = gg.a.a(z0VarA);
        z0 z0VarA2 = a1.a(null);
        this.f16098e = z0VarA2;
        this.f16099f = gg.a.a(z0VarA2);
        z0 z0VarA3 = a1.a(0);
        this.f16100g = z0VarA3;
        this.f16101h = gg.a.a(z0VarA3);
        z0 z0VarA4 = a1.a(0);
        this.f16102i = z0VarA4;
        this.f16103j = gg.a.a(z0VarA4);
        z0 z0VarA5 = a1.a(0);
        this.f16104k = z0VarA5;
        this.f16105l = gg.a.a(z0VarA5);
        z0 z0VarA6 = a1.a(0);
        this.f16106m = z0VarA6;
        this.f16107n = gg.a.a(z0VarA6);
        z0 z0VarA7 = a1.a(0);
        this.f16108o = z0VarA7;
        this.f16109p = gg.a.a(z0VarA7);
        Boolean bool = Boolean.FALSE;
        z0 z0VarA8 = a1.a(bool);
        this.f16110q = z0VarA8;
        this.f16111r = gg.a.a(z0VarA8);
        z0 z0VarA9 = a1.a(bool);
        this.f16112s = z0VarA9;
        this.f16113t = gg.a.a(z0VarA9);
        this.A = System.currentTimeMillis() + 25000;
        int i10 = sharedPreferences.getInt("saveVersion", 1);
        long j10 = sharedPreferences.getLong("paws", 0L);
        long j11 = sharedPreferences.getLong("hearts", 0L);
        int i11 = sharedPreferences.getInt("tuna", 10);
        long j12 = sharedPreferences.getLong("totalPawsEarned", j10);
        int i12 = sharedPreferences.getInt("totalClicks", 0);
        long j13 = sharedPreferences.getLong("totalHearts", 0L);
        int i13 = sharedPreferences.getInt("totalEvents", 0);
        int i14 = sharedPreferences.getInt("farmLevel", 1);
        long j14 = sharedPreferences.getLong("farmXp", 0L);
        long j15 = sharedPreferences.getLong("lastActive", System.currentTimeMillis());
        boolean z10 = sharedPreferences.getBoolean("hasMembership", sharedPreferences.getBoolean("hasVip", false));
        Map mapH = h(sharedPreferences.getString("cats", "{}"));
        Map map = a0.f22708a;
        Map mapH2 = i10 >= 2 ? h(sharedPreferences.getString("catLevels", "{}")) : map;
        Map mapH3 = i10 >= 2 ? h(sharedPreferences.getString("workers", "{}")) : map;
        Map mapH4 = i10 >= 2 ? h(sharedPreferences.getString("buildings", "{}")) : h(sharedPreferences.getString("furniture", "{}"));
        b0 b0Var = b0.f22711a;
        Set<String> stringSet = sharedPreferences.getStringSet("claimedQuests", b0Var);
        z0VarA.j(null, new i(j10, j11, i11, j12, i12, j13, i13, i14, j14, j15, mapH, mapH2, mapH3, mapH4, stringSet == null ? b0Var : stringSet, z10));
        if ((System.currentTimeMillis() - ((i) z0VarA.getValue()).f16129j) / DescriptorProtos.Edition.EDITION_2023_VALUE >= 40) {
            double dC = c((i) z0VarA.getValue());
            if (dC > 0.0d) {
                long jMin = (long) (dC * (((i) z0VarA.getValue()).f16135p ? 0.45d : 0.35d) * (((i) z0VarA.getValue()).f16135p ? Math.min(r8, 28800L) : Math.min(r8, 21600L)));
                if (jMin > 0) {
                    z0VarA2.j(null, Long.valueOf(jMin));
                }
            }
        }
        ph.h.c(cVarA, null, null, new g(this, null), 3);
        ph.h.c(cVarA, null, null, new f(this, null), 3);
    }

    public static final int a(h hVar, long j10, long j11) {
        if (j10 > j11) {
            return (int) ((j10 - j11) / 1000);
        }
        return 0;
    }

    public static Map h(String str) {
        if (str != null && !x.A(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                r.d(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
                }
                return linkedHashMap;
            } catch (Exception unused) {
            }
        }
        return a0.f22708a;
    }

    public static String i(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        String string = jSONObject.toString();
        r.d(string, "toString(...)");
        return string;
    }

    public final void b(int i10) {
        z0 z0Var;
        Object value;
        i iVar;
        int i11;
        long j10;
        if (i10 <= 0) {
            return;
        }
        do {
            z0Var = this.f16096c;
            value = z0Var.getValue();
            iVar = (i) value;
            long j11 = iVar.f16128i + i10;
            i11 = iVar.f16127h;
            j10 = j11;
            while (true) {
                long j12 = i11;
                long j13 = 100 * j12 * j12;
                if (j10 < j13) {
                    break;
                }
                j10 -= j13;
                i11++;
            }
        } while (!z0Var.a(value, i.a(iVar, 0L, 0L, 0, 0L, 0, 0L, 0, i11, j10, null, null, null, null, null, 65151)));
    }

    public final double c(i s10) {
        Object next;
        Object next2;
        r.e(s10, "s");
        Iterator<Map.Entry<String, Integer>> it = s10.f16130k.entrySet().iterator();
        double dIntValue = 0.0d;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Integer> next3 = it.next();
            String key = next3.getKey();
            int iIntValue = next3.getValue().intValue();
            Iterator<T> it2 = e.f16082a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((d) next4).f16072a.equals(key)) {
                    obj = next4;
                    break;
                }
            }
            d dVar = (d) obj;
            if (dVar != null && iIntValue > 0) {
                dIntValue = (dVar.f16077f * iIntValue * ((((s10.f16131l.get(key) != null ? r7.intValue() : 1) - 1) * 0.1d) + 1.0d)) + dIntValue;
            }
        }
        for (Map.Entry<String, Integer> entry : s10.f16132m.entrySet()) {
            String key2 = entry.getKey();
            int iIntValue2 = entry.getValue().intValue();
            Iterator<T> it3 = e.f16083b.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (((m) next2).f16158a.equals(key2)) {
                    break;
                }
            }
            m mVar = (m) next2;
            if (mVar != null && iIntValue2 > 0) {
                dIntValue = (mVar.f16163f * iIntValue2) + dIntValue;
            }
        }
        double d10 = 1.0d;
        for (Map.Entry<String, Integer> entry2 : s10.f16133n.entrySet()) {
            String key3 = entry2.getKey();
            int iIntValue3 = entry2.getValue().intValue();
            Iterator<T> it4 = e.f16084c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (((a) next).f16056a.equals(key3)) {
                    break;
                }
            }
            a aVar = (a) next;
            if (aVar != null && iIntValue3 > 0) {
                d10 += aVar.f16062g * iIntValue3;
            }
        }
        List<n> list = e.f16085d;
        int i10 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                if (((n) it5.next()).f16170e <= s10.f16127h && (i10 = i10 + 1) < 0) {
                    p.n();
                    throw null;
                }
            }
        }
        double d11 = (i10 * 0.05d) + 1.0d;
        return dIntValue * d10 * d11 * (s10.f16135p ? 1.25d : 1.0d) * (((Number) this.f16100g.getValue()).intValue() > 0 ? 3.0d : 1.0d) * (((Number) this.f16104k.getValue()).intValue() > 0 ? 2.0d : 1.0d);
    }

    public final long d(i s10) {
        r.e(s10, "s");
        Iterator<Map.Entry<String, Integer>> it = s10.f16133n.entrySet().iterator();
        long j10 = 1;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            int iIntValue = next.getValue().intValue();
            Iterator<T> it2 = e.f16084c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((a) next2).f16056a.equals(key)) {
                    obj = next2;
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null && iIntValue > 0) {
                j10 += aVar.f16061f * iIntValue;
            }
        }
        int i10 = 0;
        double dM = (jh.j.m(((Number) this.f16106m.getValue()).intValue(), 0, 50) * 0.02d) + 1.0d;
        List<n> list = e.f16085d;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((n) it3.next()).f16170e <= s10.f16127h && (i10 = i10 + 1) < 0) {
                    p.n();
                    throw null;
                }
            }
        }
        double d10 = (i10 * 0.05d) + 1.0d;
        long j11 = (long) (j10 * dM * d10 * (s10.f16135p ? 1.25d : 1.0d) * (((Number) this.f16100g.getValue()).intValue() > 0 ? 3.0d : 1.0d) * (((Number) this.f16102i.getValue()).intValue() > 0 ? 3.0d : 1.0d));
        if (j11 < 1) {
            return 1L;
        }
        return j11;
    }

    public final long e(String str) {
        return (((i) this.f16096c.getValue()).f16131l.get(str) != null ? r5.intValue() : 1) * 5;
    }

    public final long f(k quest) {
        int iV;
        r.e(quest, "quest");
        i iVar = (i) this.f16096c.getValue();
        switch (quest.f16143e.ordinal()) {
            case 0:
                iV = iVar.f16124e;
                break;
            case 1:
                return iVar.f16123d;
            case 2:
                return iVar.f16125f;
            case 3:
                iV = qg.x.V(iVar.f16130k.values());
                break;
            case 4:
                iV = qg.x.V(iVar.f16132m.values());
                break;
            case 5:
                iV = qg.x.V(iVar.f16133n.values());
                break;
            case 6:
                iV = iVar.f16127h;
                break;
            case 7:
                iV = iVar.f16126g;
                break;
            default:
                throw new pg.l();
        }
        return iV;
    }

    public final boolean g(k quest) {
        r.e(quest, "quest");
        return f(quest) >= quest.f16144f && !((i) this.f16096c.getValue()).f16134o.contains(quest.f16139a);
    }

    public final void j() {
        i iVar = (i) this.f16096c.getValue();
        this.f16095b.edit().putInt("saveVersion", 2).putLong("paws", iVar.f16120a).putLong("hearts", iVar.f16121b).putInt("tuna", iVar.f16122c).putLong("totalPawsEarned", iVar.f16123d).putInt("totalClicks", iVar.f16124e).putLong("totalHearts", iVar.f16125f).putInt("totalEvents", iVar.f16126g).putInt("farmLevel", iVar.f16127h).putLong("farmXp", iVar.f16128i).putLong("lastActive", System.currentTimeMillis()).putBoolean("hasMembership", iVar.f16135p).putString("cats", i(iVar.f16130k)).putString("catLevels", i(iVar.f16131l)).putString("workers", i(iVar.f16132m)).putString("buildings", i(iVar.f16133n)).putStringSet("claimedQuests", iVar.f16134o).apply();
    }
}
