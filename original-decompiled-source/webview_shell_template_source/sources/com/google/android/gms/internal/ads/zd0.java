package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zd0 implements fk0 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f11264t;

    /* renamed from: u, reason: collision with root package name */
    public Object f11265u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11266v;

    /* renamed from: w, reason: collision with root package name */
    public Object f11267w;

    public zd0(ph phVar, File file, File file2, File file3) {
        this.s = phVar;
        this.f11264t = file;
        this.f11265u = file3;
        this.f11266v = file2;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public /* synthetic */ fk0 a(cb1 cb1Var) {
        this.f11264t = cb1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public /* synthetic */ fk0 b(oa1 oa1Var) {
        this.f11265u = oa1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ae0 zzh() {
        ih1.k((rm0) this.f11266v, rm0.class);
        ih1.k((jk0) this.f11267w, jk0.class);
        return new ae0((kd0) this.s, new bq(24, (byte) 0), (rm0) this.f11266v, (jk0) this.f11267w, new xj0(11), (cb1) this.f11264t, (oa1) this.f11265u);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] d() throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArrC;
        FileInputStream fileInputStream2 = null;
        if (((byte[]) this.f11267w) == null) {
            try {
                fileInputStream = new FileInputStream((File) this.f11266v);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ArrayList arrayList = new ArrayList();
                int iMin = 256;
                while (true) {
                    byte[] bArr2 = new byte[iMin];
                    int i6 = 0;
                    while (i6 < iMin) {
                        int i7 = fileInputStream.read(bArr2, i6, iMin - i6);
                        if (i7 == -1) {
                            break;
                        }
                        i6 += i7;
                    }
                    e42 e42VarS = i6 == 0 ? null : g42.s(0, i6, bArr2);
                    if (e42VarS == null) {
                        break;
                    }
                    arrayList.add(e42VarS);
                    iMin = Math.min(iMin + iMin, 8192);
                }
                bArrC = g42.r(arrayList).c();
                i3.f.a(fileInputStream);
            } catch (IOException unused2) {
                i3.f.a(fileInputStream);
                bArrC = null;
                this.f11267w = bArrC;
                bArr = (byte[]) this.f11267w;
                if (bArr != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                i3.f.a(fileInputStream2);
                throw th;
            }
            this.f11267w = bArrC;
        }
        bArr = (byte[]) this.f11267w;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public /* synthetic */ zd0(kd0 kd0Var) {
        this.s = kd0Var;
    }
}
