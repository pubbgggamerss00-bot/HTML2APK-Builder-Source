package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u90 extends s90 {

    /* renamed from: x, reason: collision with root package name */
    public static final Set f9503x = Collections.synchronizedSet(new HashSet());

    /* renamed from: y, reason: collision with root package name */
    public static final DecimalFormat f9504y = new DecimalFormat("#,###");

    /* renamed from: v, reason: collision with root package name */
    public File f9505v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9506w;

    @Override // com.google.android.gms.internal.ads.s90
    public final void i() {
        this.f9506w = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d3  */
    @Override // com.google.android.gms.internal.ads.s90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(String str) throws IOException {
        int i6;
        String str2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ByteBuffer byteBuffer;
        int i7;
        long j6;
        boolean zDelete;
        int i8 = 0;
        if (this.f9505v == null) {
            j(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.f9505v;
            if (file == null) {
                i6 = 0;
            } else {
                i6 = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i6++;
                    }
                }
            }
            if (i6 > ((Integer) zzbe.zzc().a(zn.f11459q)).intValue()) {
                File file3 = this.f9505v;
                if (file3 == null) {
                    break;
                }
                long j7 = Long.MAX_VALUE;
                File file4 = null;
                for (File file5 : file3.listFiles()) {
                    if (!file5.getName().endsWith(".done")) {
                        long jLastModified = file5.lastModified();
                        if (jLastModified < j7) {
                            file4 = file5;
                            j7 = jLastModified;
                        }
                    }
                }
                if (file4 != null) {
                    zDelete = file4.delete();
                    File fileS = s(file4);
                    if (fileS.isFile()) {
                        zDelete &= fileS.delete();
                    }
                } else {
                    zDelete = false;
                }
            } else {
                String strZzf = zzf.zzf(str);
                File file6 = this.f9505v;
                int i9 = pj1.f8098a;
                File file7 = new File(new File(file6, strZzf).getPath());
                File fileS2 = s(file7);
                if (file7.isFile() && fileS2.isFile()) {
                    int length = (int) file7.length();
                    zzo.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzf.zza.post(new p90(this, str, file7.getAbsolutePath(), length));
                    return true;
                }
                String strValueOf = String.valueOf(this.f9505v.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = f9503x;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            zzo.zzj("Stream cache already in progress at " + str);
                            j(str, file7.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str3 = "error";
                        try {
                            rj1 rj1Var = new rj1(i8);
                            tj1 tj1Var = new tj1();
                            tj1Var.s = rj1Var;
                            tj1Var.f9311t = null;
                            HttpURLConnection httpURLConnectionA = tj1Var.a(new eu1(str, 3));
                            int responseCode = httpURLConnectionA.getResponseCode();
                            if (responseCode >= 400) {
                                str3 = "badUrl";
                                str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException e6) {
                                    e = e6;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.f9506w) {
                                    }
                                    if (file7.exists()) {
                                    }
                                    j(str, file7.getAbsolutePath(), str3, str2);
                                    f9503x.remove(strConcat);
                                    return false;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.f9506w) {
                                    }
                                    if (file7.exists()) {
                                    }
                                    j(str, file7.getAbsolutePath(), str3, str2);
                                    f9503x.remove(strConcat);
                                    return false;
                                }
                            }
                            int contentLength = httpURLConnectionA.getContentLength();
                            if (contentLength < 0) {
                                zzo.zzj("Stream cache aborted, missing content-length header at " + str);
                                j(str, file7.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat);
                                return false;
                            }
                            String str4 = f9504y.format(contentLength);
                            int iIntValue = ((Integer) zzbe.zzc().a(zn.f11466r)).intValue();
                            if (contentLength > iIntValue) {
                                zzo.zzj("Content length " + str4 + " exceeds limit at " + str);
                                StringBuilder sb = new StringBuilder();
                                sb.append("File too big for full file cache. Size: ");
                                sb.append(str4);
                                j(str, file7.getAbsolutePath(), "sizeExceeded", sb.toString());
                                set.remove(strConcat);
                                return false;
                            }
                            zzo.zze("Caching " + str4 + " bytes from " + str);
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionA.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file7);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                i3.a aVarZzC = zzv.zzC();
                                long jA = aVarZzC.a();
                                zzbx zzbxVar = new zzbx(((Long) zzbe.zzc().a(zn.L)).longValue());
                                pn pnVar = zn.K;
                                xn xnVarZzc = zzbe.zzc();
                                long jLongValue = ((Long) xnVarZzc.a(pnVar)).longValue();
                                int i10 = 0;
                                while (true) {
                                    int i11 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                    if (i11 < 0) {
                                        fileOutputStream3.close();
                                        if (zzo.zzm(3)) {
                                            zzo.zze("Preloaded " + f9504y.format(i10) + " bytes from " + str);
                                        }
                                        file7.setReadable(true, false);
                                        if (fileS2.isFile()) {
                                            fileS2.setLastModified(System.currentTimeMillis());
                                        } else {
                                            try {
                                                fileS2.createNewFile();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        zzf.zza.post(new p90(this, str, file7.getAbsolutePath(), i10));
                                        f9503x.remove(strConcat);
                                        return true;
                                    }
                                    int i12 = i10 + i11;
                                    try {
                                        if (i12 > iIntValue) {
                                            String str5 = "File too big for full file cache. Size: " + Integer.toString(i12);
                                            throw new IOException("stream cache file size limit exceeded");
                                        }
                                        byteBufferAllocate.flip();
                                        while (channel.write(byteBufferAllocate) > 0) {
                                            i12 = i12;
                                            byteBufferAllocate = byteBufferAllocate;
                                        }
                                        byteBufferAllocate.clear();
                                        if (aVarZzC.a() - jA > 1000 * jLongValue) {
                                            String str6 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                            throw new IOException("stream cache time limit exceeded");
                                        }
                                        FileChannel fileChannel = channel;
                                        if (this.f9506w) {
                                            throw new IOException("abort requested");
                                        }
                                        if (zzbxVar.zzb()) {
                                            fileOutputStream2 = fileOutputStream3;
                                            try {
                                                try {
                                                    int i13 = i12;
                                                    byteBuffer = byteBufferAllocate;
                                                    i7 = i13;
                                                    j6 = jLongValue;
                                                    zzf.zza.post(new l90(this, str, file7.getAbsolutePath(), i7, contentLength));
                                                } catch (IOException e8) {
                                                    e = e8;
                                                    fileOutputStream = fileOutputStream2;
                                                    str2 = null;
                                                    if (e instanceof RuntimeException) {
                                                        zzv.zzp().h("VideoStreamFullFileCache.preload", e);
                                                    }
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException | NullPointerException unused2) {
                                                    }
                                                    if (this.f9506w) {
                                                        zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                    } else {
                                                        zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                    }
                                                    if (file7.exists() && !file7.delete()) {
                                                        zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file7.getAbsolutePath())));
                                                    }
                                                    j(str, file7.getAbsolutePath(), str3, str2);
                                                    f9503x.remove(strConcat);
                                                    return false;
                                                }
                                            } catch (RuntimeException e9) {
                                                e = e9;
                                                fileOutputStream = fileOutputStream2;
                                                str2 = null;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream.close();
                                                if (this.f9506w) {
                                                }
                                                if (file7.exists()) {
                                                    zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file7.getAbsolutePath())));
                                                }
                                                j(str, file7.getAbsolutePath(), str3, str2);
                                                f9503x.remove(strConcat);
                                                return false;
                                            }
                                        } else {
                                            int i14 = i12;
                                            byteBuffer = byteBufferAllocate;
                                            i7 = i14;
                                            fileOutputStream2 = fileOutputStream3;
                                            j6 = jLongValue;
                                        }
                                        ByteBuffer byteBuffer2 = byteBuffer;
                                        i10 = i7;
                                        byteBufferAllocate = byteBuffer2;
                                        channel = fileChannel;
                                        fileOutputStream3 = fileOutputStream2;
                                        jLongValue = j6;
                                    } catch (IOException | RuntimeException e10) {
                                        e = e10;
                                        str2 = xnVarZzc;
                                        fileOutputStream = fileOutputStream2;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.f9506w) {
                                        }
                                        if (file7.exists()) {
                                        }
                                        j(str, file7.getAbsolutePath(), str3, str2);
                                        f9503x.remove(strConcat);
                                        return false;
                                    }
                                }
                            } catch (IOException e11) {
                                e = e11;
                                fileOutputStream2 = fileOutputStream3;
                                fileOutputStream = fileOutputStream2;
                                str2 = null;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f9506w) {
                                }
                                if (file7.exists()) {
                                }
                                j(str, file7.getAbsolutePath(), str3, str2);
                                f9503x.remove(strConcat);
                                return false;
                            } catch (RuntimeException e12) {
                                e = e12;
                                fileOutputStream2 = fileOutputStream3;
                                fileOutputStream = fileOutputStream2;
                                str2 = null;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f9506w) {
                                }
                                if (file7.exists()) {
                                }
                                j(str, file7.getAbsolutePath(), str3, str2);
                                f9503x.remove(strConcat);
                                return false;
                            }
                        } catch (IOException | RuntimeException e13) {
                            e = e13;
                            str2 = null;
                        }
                    } finally {
                    }
                }
            }
        } while (zDelete);
        zzo.zzj("Unable to expire stream cache");
        j(str, null, "expireFailed", null);
        return false;
    }

    public final File s(File file) {
        File file2 = this.f9505v;
        String strConcat = String.valueOf(file.getName()).concat(".done");
        int i6 = pj1.f8098a;
        return new File(new File(file2, strConcat).getPath());
    }
}
