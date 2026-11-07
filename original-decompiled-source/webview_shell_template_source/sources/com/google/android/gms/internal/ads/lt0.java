package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lt0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6851a = new HashMap();

    public final synchronized kt0 a(String str) {
        return (kt0) this.f6851a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(String str, rc1 rc1Var) {
        gc1 gc1Var;
        n00 n00VarZzl;
        if (this.f6851a.containsKey(str)) {
            return;
        }
        n00 n00VarZzm = null;
        if (rc1Var == null) {
            n00VarZzl = null;
            if (rc1Var != null) {
                try {
                    n00VarZzm = rc1Var.f8609a.zzm();
                } finally {
                    try {
                    } catch (gc1 unused) {
                    }
                }
            }
            boolean z6 = true;
            if (((Boolean) zzbe.zzc().a(zn.k9)).booleanValue()) {
                if (rc1Var == null) {
                    z6 = false;
                } else {
                    try {
                        rc1Var.a();
                    } catch (gc1 unused2) {
                    }
                }
            }
            this.f6851a.put(str, new kt0(str, n00VarZzl, n00VarZzm, z6));
            return;
        }
        try {
            n00VarZzl = rc1Var.f8609a.zzl();
            if (rc1Var != null) {
            }
            boolean z62 = true;
            if (((Boolean) zzbe.zzc().a(zn.k9)).booleanValue()) {
            }
            this.f6851a.put(str, new kt0(str, n00VarZzl, n00VarZzm, z62));
            return;
        } finally {
            try {
            } catch (gc1 unused3) {
            }
        }
    }
}
