package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class cc implements ib {
    protected final ec zza;
    private final bc zzb;

    public cc(bc bcVar) {
        ec ecVar = new ec();
        this.zzb = bcVar;
        this.zza = ecVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0274 A[LOOP:0: B:3:0x000e->B:141:0x0274, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0292 A[EDGE_INSN: B:164:0x0292->B:142:0x0292 BREAK  A[LOOP:0: B:3:0x000e->B:141:0x0274], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lb zza(pb pbVar) throws Throwable {
        kc kcVar;
        byte[] bArr;
        ni0 ni0Var;
        String str;
        int iZzb;
        int i6;
        Map map;
        kc kcVarA;
        byte[] byteArray;
        byte[] bArrB;
        cc ccVar = this;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                za zaVarZzd = pbVar.zzd();
                if (zaVarZzd == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zaVarZzd.f11234b;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j6 = zaVarZzd.f11236d;
                    if (j6 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j6)));
                    }
                    map = map2;
                }
                kcVarA = ccVar.zzb.a(pbVar, map);
            } catch (IOException e6) {
                e = e6;
                kcVar = null;
            }
            try {
                int i7 = kcVarA.f6316a;
                List listUnmodifiableList = Collections.unmodifiableList(kcVarA.f6317b);
                if (i7 == 304) {
                    SystemClock.elapsedRealtime();
                    za zaVarZzd2 = pbVar.zzd();
                    if (zaVarZzd2 == null) {
                        return new lb(304, null, true, listUnmodifiableList);
                    }
                    TreeSet treeSet = new TreeSet(comparator);
                    if (!listUnmodifiableList.isEmpty()) {
                        Iterator it = listUnmodifiableList.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((hb) it.next()).f5314a);
                        }
                    }
                    ArrayList arrayList = new ArrayList(listUnmodifiableList);
                    List list = zaVarZzd2.h;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (hb hbVar : zaVarZzd2.h) {
                                if (!treeSet.contains(hbVar.f5314a)) {
                                    arrayList.add(hbVar);
                                }
                            }
                        }
                    } else if (!zaVarZzd2.f11239g.isEmpty()) {
                        for (Map.Entry entry : zaVarZzd2.f11239g.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new hb((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new lb(304, zaVarZzd2.f11233a, true, arrayList);
                }
                InputStream inputStream = kcVarA.f6319d;
                if (inputStream == null) {
                    inputStream = null;
                }
                if (inputStream != null) {
                    int i8 = kcVarA.f6318c;
                    ec ecVar = ccVar.zza;
                    nc ncVar = new nc(ecVar, i8);
                    try {
                        bArrB = ecVar.b(1024);
                        while (true) {
                            try {
                                int i9 = inputStream.read(bArrB);
                                if (i9 == -1) {
                                    break;
                                }
                                ncVar.write(bArrB, 0, i9);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    inputStream.close();
                                    break;
                                } catch (IOException unused) {
                                    ac.c("Error occurred when closing InputStream", new Object[0]);
                                }
                                ecVar.a(bArrB);
                                ncVar.close();
                                throw th;
                            }
                        }
                        byteArray = ncVar.toByteArray();
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            ac.c("Error occurred when closing InputStream", new Object[0]);
                        }
                        ecVar.a(bArrB);
                        ncVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bArrB = null;
                    }
                } else {
                    byteArray = new byte[0];
                }
                try {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (ac.f2645a || jElapsedRealtime2 > 3000) {
                        ac.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", pbVar, Long.valueOf(jElapsedRealtime2), byteArray != null ? Integer.valueOf(byteArray.length) : "null", Integer.valueOf(i7), Integer.valueOf(pbVar.zzy().f4581b));
                    }
                    if (i7 < 200 || i7 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new lb(i7, byteArray, false, listUnmodifiableList);
                } catch (IOException e7) {
                    e = e7;
                    bArr = byteArray;
                    kcVar = kcVarA;
                    if (!(e instanceof SocketTimeoutException)) {
                    }
                    str = (String) ni0Var.f7447t;
                    fb fbVarZzy = pbVar.zzy();
                    iZzb = pbVar.zzb();
                    try {
                        xb xbVar = (xb) ni0Var.f7448u;
                        i6 = fbVarZzy.f4581b + 1;
                        fbVarZzy.f4581b = i6;
                        int i10 = fbVarZzy.f4580a;
                        fbVarZzy.f4580a = i10 + i10;
                        if (i6 <= 1) {
                        }
                    } catch (xb e8) {
                        pbVar.zzm(str + "-timeout-giveup [timeout=" + iZzb + "]");
                        throw e8;
                    }
                }
            } catch (IOException e9) {
                e = e9;
                kcVar = kcVarA;
                bArr = null;
                if (!(e instanceof SocketTimeoutException)) {
                    ni0Var = new ni0(3, "socket", new wb());
                } else {
                    if (e instanceof MalformedURLException) {
                        throw new RuntimeException("Bad URL ".concat(String.valueOf(pbVar.zzk())), e);
                    }
                    if (kcVar == null) {
                        throw new mb(e);
                    }
                    int i11 = kcVar.f6316a;
                    ac.b("Unexpected response code %d for %s", Integer.valueOf(i11), pbVar.zzk());
                    if (bArr != null) {
                        List<hb> listUnmodifiableList2 = Collections.unmodifiableList(kcVar.f6317b);
                        SystemClock.elapsedRealtime();
                        if (listUnmodifiableList2 != null) {
                            if (listUnmodifiableList2.isEmpty()) {
                                Map map3 = Collections.EMPTY_MAP;
                            } else {
                                TreeMap treeMap = new TreeMap(comparator);
                                for (hb hbVar2 : listUnmodifiableList2) {
                                    treeMap.put(hbVar2.f5314a, hbVar2.f5315b);
                                }
                            }
                        }
                        if (listUnmodifiableList2 != null) {
                            Collections.unmodifiableList(listUnmodifiableList2);
                        }
                        if (i11 != 401 && i11 != 403) {
                            if (i11 < 400 || i11 > 499) {
                                throw new vb();
                            }
                            throw new db();
                        }
                        ni0Var = new ni0(3, "auth", new ya());
                    } else {
                        ni0Var = new ni0(3, "network", new kb());
                    }
                }
                str = (String) ni0Var.f7447t;
                fb fbVarZzy2 = pbVar.zzy();
                iZzb = pbVar.zzb();
                xb xbVar2 = (xb) ni0Var.f7448u;
                i6 = fbVarZzy2.f4581b + 1;
                fbVarZzy2.f4581b = i6;
                int i102 = fbVarZzy2.f4580a;
                fbVarZzy2.f4580a = i102 + i102;
                if (i6 <= 1) {
                    throw xbVar2;
                }
                pbVar.zzm(str + "-retry [timeout=" + iZzb + "]");
                ccVar = this;
            }
            pbVar.zzm(str + "-retry [timeout=" + iZzb + "]");
            ccVar = this;
        }
    }
}
