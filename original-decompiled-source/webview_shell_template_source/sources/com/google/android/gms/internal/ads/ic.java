package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ic implements ab {

    /* renamed from: c, reason: collision with root package name */
    public final hc f5653c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5651a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f5652b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5654d = 5242880;

    public ic(s70 s70Var) {
        this.f5653c = s70Var;
    }

    public static int d(gc gcVar) {
        return (l(gcVar) << 24) | l(gcVar) | (l(gcVar) << 8) | (l(gcVar) << 16);
    }

    public static long e(gc gcVar) {
        return (l(gcVar) & 255) | ((l(gcVar) & 255) << 8) | ((l(gcVar) & 255) << 16) | ((l(gcVar) & 255) << 24) | ((l(gcVar) & 255) << 32) | ((l(gcVar) & 255) << 40) | ((l(gcVar) & 255) << 48) | ((l(gcVar) & 255) << 56);
    }

    public static String g(gc gcVar) {
        return new String(k(gcVar, e(gcVar)), "UTF-8");
    }

    public static void h(BufferedOutputStream bufferedOutputStream, int i6) throws IOException {
        bufferedOutputStream.write(i6 & 255);
        bufferedOutputStream.write((i6 >> 8) & 255);
        bufferedOutputStream.write((i6 >> 16) & 255);
        bufferedOutputStream.write((i6 >> 24) & 255);
    }

    public static void i(BufferedOutputStream bufferedOutputStream, long j6) throws IOException {
        bufferedOutputStream.write((byte) j6);
        bufferedOutputStream.write((byte) (j6 >>> 8));
        bufferedOutputStream.write((byte) (j6 >>> 16));
        bufferedOutputStream.write((byte) (j6 >>> 24));
        bufferedOutputStream.write((byte) (j6 >>> 32));
        bufferedOutputStream.write((byte) (j6 >>> 40));
        bufferedOutputStream.write((byte) (j6 >>> 48));
        bufferedOutputStream.write((byte) (j6 >>> 56));
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] k(gc gcVar, long j6) throws IOException {
        long j7 = gcVar.s - gcVar.f4993t;
        if (j6 >= 0 && j6 <= j7) {
            int i6 = (int) j6;
            if (i6 == j6) {
                byte[] bArr = new byte[i6];
                new DataInputStream(gcVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j6 + ", maxLength=" + j7);
    }

    public static int l(gc gcVar) throws IOException {
        int i6 = gcVar.read();
        if (i6 != -1) {
            return i6;
        }
        throw new EOFException();
    }

    public static final String n(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized za a(String str) {
        fc fcVar = (fc) this.f5651a.get(str);
        if (fcVar == null) {
            return null;
        }
        File fileF = f(str);
        try {
            gc gcVar = new gc(new BufferedInputStream(new FileInputStream(fileF)), fileF.length());
            try {
                fc fcVarA = fc.a(gcVar);
                if (!TextUtils.equals(str, fcVarA.f4600b)) {
                    ac.a("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, fcVarA.f4600b);
                    fc fcVar2 = (fc) this.f5651a.remove(str);
                    if (fcVar2 != null) {
                        this.f5652b -= fcVar2.f4599a;
                    }
                    return null;
                }
                byte[] bArrK = k(gcVar, gcVar.s - gcVar.f4993t);
                za zaVar = new za();
                zaVar.f11233a = bArrK;
                zaVar.f11234b = fcVar.f4601c;
                zaVar.f11235c = fcVar.f4602d;
                zaVar.f11236d = fcVar.f4603e;
                zaVar.f11237e = fcVar.f4604f;
                zaVar.f11238f = fcVar.f4605g;
                List<hb> list = fcVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (hb hbVar : list) {
                    treeMap.put(hbVar.f5314a, hbVar.f5315b);
                }
                zaVar.f11239g = treeMap;
                zaVar.h = Collections.unmodifiableList(fcVar.h);
                return zaVar;
            } finally {
                gcVar.close();
            }
        } catch (IOException e6) {
            ac.a("%s: %s", fileF.getAbsolutePath(), e6.toString());
            synchronized (this) {
                boolean zDelete = f(str).delete();
                fc fcVar3 = (fc) this.f5651a.remove(str);
                if (fcVar3 != null) {
                    this.f5652b -= fcVar3.f4599a;
                }
                if (!zDelete) {
                    ac.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public final synchronized void b() {
        File fileMo4zza = this.f5653c.mo4zza();
        if (fileMo4zza.exists()) {
            File[] fileArrListFiles = fileMo4zza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        gc gcVar = new gc(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            fc fcVarA = fc.a(gcVar);
                            fcVarA.f4599a = length;
                            m(fcVarA.f4600b, fcVarA);
                            gcVar.close();
                        } catch (Throwable th) {
                            gcVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileMo4zza.mkdirs()) {
            ac.b("Unable to create cache dir %s", fileMo4zza.getAbsolutePath());
        }
    }

    public final synchronized void c(String str, za zaVar) {
        try {
            long j6 = this.f5652b;
            int length = zaVar.f11233a.length;
            long j7 = j6 + length;
            int i6 = this.f5654d;
            if (j7 <= i6 || length <= i6 * 0.9f) {
                File fileF = f(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileF));
                    fc fcVar = new fc(str, zaVar);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = fcVar.f4601c;
                        if (str2 == null) {
                            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, fcVar.f4602d);
                        i(bufferedOutputStream, fcVar.f4603e);
                        i(bufferedOutputStream, fcVar.f4604f);
                        i(bufferedOutputStream, fcVar.f4605g);
                        List<hb> list = fcVar.h;
                        if (list != null) {
                            h(bufferedOutputStream, list.size());
                            for (hb hbVar : list) {
                                j(bufferedOutputStream, hbVar.f5314a);
                                j(bufferedOutputStream, hbVar.f5315b);
                            }
                        } else {
                            h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zaVar.f11233a);
                        bufferedOutputStream.close();
                        fcVar.f4599a = fileF.length();
                        m(str, fcVar);
                        if (this.f5652b >= this.f5654d) {
                            if (ac.f2645a) {
                                ac.c("Pruning old cache entries.", new Object[0]);
                            }
                            long j8 = this.f5652b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f5651a.entrySet().iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                fc fcVar2 = (fc) ((Map.Entry) it.next()).getValue();
                                if (f(fcVar2.f4600b).delete()) {
                                    this.f5652b -= fcVar2.f4599a;
                                } else {
                                    String str3 = fcVar2.f4600b;
                                    ac.a("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i7++;
                                if (this.f5652b < this.f5654d * 0.9f) {
                                    break;
                                }
                            }
                            if (ac.f2645a) {
                                ac.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i7), Long.valueOf(this.f5652b - j8), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e6) {
                        ac.a("%s", e6.toString());
                        bufferedOutputStream.close();
                        ac.a("Failed to write header for %s", fileF.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileF.delete()) {
                        ac.a("Could not clean up file %s", fileF.getAbsolutePath());
                    }
                    if (!this.f5653c.mo4zza().exists()) {
                        ac.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f5651a.clear();
                        this.f5652b = 0L;
                        b();
                    }
                }
            }
        } finally {
        }
    }

    public final File f(String str) {
        return new File(this.f5653c.mo4zza(), n(str));
    }

    public final void m(String str, fc fcVar) {
        LinkedHashMap linkedHashMap = this.f5651a;
        if (linkedHashMap.containsKey(str)) {
            this.f5652b = (fcVar.f4599a - ((fc) linkedHashMap.get(str)).f4599a) + this.f5652b;
        } else {
            this.f5652b += fcVar.f4599a;
        }
        linkedHashMap.put(str, fcVar);
    }

    public ic(File file) {
        this.f5653c = new dh0(5, file);
    }
}
