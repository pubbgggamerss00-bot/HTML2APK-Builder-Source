package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xc1 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10494a;

    /* renamed from: b, reason: collision with root package name */
    public final cd1 f10495b;

    /* renamed from: c, reason: collision with root package name */
    public final zc1 f10496c = new zc1();

    public xc1(cd1 cd1Var) {
        this.f10494a = new ConcurrentHashMap(cd1Var.f3525w);
        this.f10495b = cd1Var;
    }

    public final synchronized boolean a(fd1 fd1Var, ed1 ed1Var) {
        boolean z6;
        try {
            wc1 wc1Var = (wc1) this.f10494a.get(fd1Var);
            ed1Var.f4237d = zzv.zzC().a();
            if (wc1Var == null) {
                cd1 cd1Var = this.f10495b;
                wc1 wc1Var2 = new wc1(cd1Var.f3525w, cd1Var.f3526x * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                if (this.f10494a.size() == this.f10495b.f3524v) {
                    int i6 = this.f10495b.B;
                    int i7 = i6 - 1;
                    fd1 fd1Var2 = null;
                    if (i6 == 0) {
                        throw null;
                    }
                    long j6 = Long.MAX_VALUE;
                    if (i7 == 0) {
                        for (Map.Entry entry : this.f10494a.entrySet()) {
                            if (((wc1) entry.getValue()).f10160d.f7726a < j6) {
                                j6 = ((wc1) entry.getValue()).f10160d.f7726a;
                                fd1Var2 = (fd1) entry.getKey();
                            }
                        }
                        if (fd1Var2 != null) {
                            this.f10494a.remove(fd1Var2);
                        }
                    } else if (i7 == 1) {
                        for (Map.Entry entry2 : this.f10494a.entrySet()) {
                            if (((wc1) entry2.getValue()).f10160d.f7728c < j6) {
                                j6 = ((wc1) entry2.getValue()).f10160d.f7728c;
                                fd1Var2 = (fd1) entry2.getKey();
                            }
                        }
                        if (fd1Var2 != null) {
                            this.f10494a.remove(fd1Var2);
                        }
                    } else if (i7 == 2) {
                        int i8 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.f10494a.entrySet()) {
                            if (((wc1) entry3.getValue()).f10160d.f7729d < i8) {
                                i8 = ((wc1) entry3.getValue()).f10160d.f7729d;
                                fd1Var2 = (fd1) entry3.getKey();
                            }
                        }
                        if (fd1Var2 != null) {
                            this.f10494a.remove(fd1Var2);
                        }
                    }
                    zc1 zc1Var = this.f10496c;
                    zc1Var.f11260c++;
                    zc1Var.f11258a.f10918t = true;
                }
                this.f10494a.put(fd1Var, wc1Var2);
                zc1 zc1Var2 = this.f10496c;
                zc1Var2.f11259b++;
                zc1Var2.f11258a.s = true;
                wc1Var = wc1Var2;
            }
            od1 od1Var = wc1Var.f10160d;
            od1Var.getClass();
            od1Var.f7728c = zzv.zzC().a();
            od1Var.f7729d++;
            wc1Var.a();
            LinkedList linkedList = wc1Var.f10157a;
            if (linkedList.size() == wc1Var.f10158b) {
                z6 = false;
            } else {
                linkedList.add(ed1Var);
                z6 = true;
            }
            zc1 zc1Var3 = this.f10496c;
            zc1Var3.f11263f++;
            yc1 yc1Var = zc1Var3.f11258a;
            yc1 yc1VarClone = yc1Var.clone();
            yc1Var.s = false;
            yc1Var.f10918t = false;
            nd1 nd1Var = wc1Var.f10160d.f7727b;
            nd1 nd1VarClone = nd1Var.clone();
            nd1Var.s = false;
            nd1Var.f7421t = 0;
            vl vlVarB = am.B();
            tl tlVarE = ul.E();
            tlVarE.i();
            ul.B((ul) tlVarE.f4126t);
            yl ylVarE = zl.E();
            boolean z7 = yc1VarClone.s;
            ylVarE.i();
            zl.B((zl) ylVarE.f4126t, z7);
            boolean z8 = yc1VarClone.f10918t;
            ylVarE.i();
            zl.C((zl) ylVarE.f4126t, z8);
            int i9 = nd1VarClone.f7421t;
            ylVarE.i();
            zl.D((zl) ylVarE.f4126t, i9);
            tlVarE.i();
            ul.D((ul) tlVarE.f4126t, ylVarE.g());
            vlVarB.i();
            am.D((am) vlVarB.f4126t, tlVarE.g());
            ed1Var.f4234a.zzb().f4698f.G(vlVarB.g());
            b();
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    public final void b() {
        if (((Boolean) zzbe.zzc().a(zn.h6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            cd1 cd1Var = this.f10495b;
            sb.append(cd1Var.f3523u);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            zc1 zc1Var = this.f10496c;
            sb2.append(zc1Var.f11261d);
            sb2.append("\n\tNew pools created: ");
            sb2.append(zc1Var.f11259b);
            sb2.append("\n\tPools removed: ");
            sb2.append(zc1Var.f11260c);
            sb2.append("\n\tEntries added: ");
            sb2.append(zc1Var.f11263f);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(zc1Var.f11262e);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i6 = 0;
            for (Map.Entry entry : this.f10494a.entrySet()) {
                i6++;
                sb.append(i6);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((fd1) entry.getKey()).hashCode());
                sb.append("    ");
                int i7 = 0;
                while (true) {
                    wc1 wc1Var = (wc1) entry.getValue();
                    wc1Var.a();
                    if (i7 >= wc1Var.f10157a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i7++;
                }
                wc1 wc1Var2 = (wc1) entry.getValue();
                wc1Var2.a();
                for (int size = wc1Var2.f10157a.size(); size < cd1Var.f3525w; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                od1 od1Var = ((wc1) entry.getValue()).f10160d;
                sb.append("Created: " + od1Var.f7726a + " Last accessed: " + od1Var.f7728c + " Accesses: " + od1Var.f7729d + "\nEntries retrieved: Valid: " + od1Var.f7730e + " Stale: " + od1Var.f7731f);
                sb.append("\n");
            }
            while (i6 < cd1Var.f3524v) {
                i6++;
                sb.append(i6);
                sb.append(".\n");
            }
            zzo.zze(sb.toString());
        }
    }
}
