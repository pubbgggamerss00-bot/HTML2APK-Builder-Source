package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ej2 implements tl1 {
    public final /* synthetic */ yj2 s;

    public /* synthetic */ ej2(yj2 yj2Var) {
        this.s = yj2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:12:0x001a, B:38:0x005b, B:40:0x0060, B:42:0x0064, B:44:0x0068, B:46:0x0070, B:48:0x007a, B:15:0x0021, B:29:0x004c, B:31:0x0050, B:33:0x0054, B:52:0x0086), top: B:56:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.tl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(Object obj) {
        boolean z6;
        int i6;
        sj2 sj2Var;
        sj2 sj2Var2;
        yj2 yj2Var = this.s;
        w wVar = (w) obj;
        synchronized (yj2Var.f11012c) {
            try {
                z6 = true;
                if (yj2Var.f11015f.f6091p && !yj2Var.f11014e && (i6 = wVar.B) != -1 && i6 > 2) {
                    String str = wVar.f9978m;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    if (j31.f5914a >= 32 && (sj2Var = yj2Var.f11016g) != null && sj2Var.f8960b) {
                                    }
                                }
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                }
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                }
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                }
                                break;
                        }
                    }
                    if (j31.f5914a < 32 || (sj2Var2 = yj2Var.f11016g) == null || !sj2Var2.f8960b || !sj2Var2.f8959a.isAvailable() || !yj2Var.f11016g.f8959a.isEnabled() || !yj2Var.f11016g.a(wVar, yj2Var.h)) {
                        z6 = false;
                    }
                }
            } finally {
            }
        }
        return z6;
    }
}
