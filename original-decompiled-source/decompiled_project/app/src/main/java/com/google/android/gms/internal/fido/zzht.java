package com.google.android.gms.internal.fido;

import h1.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import m0.r;

/* loaded from: classes2.dex */
final class zzht {
    private final Deque zza = new ArrayDeque(16);

    private zzht(boolean z10) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j10) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j10));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + this.zza.size() + " scope: " + zzh());
    }

    public final void zzc() throws IOException {
        long jZzh = zzh();
        if (jZzh >= 0) {
            throw new IOException(r.a("expected indefinite length scope but found ", jZzh));
        }
        if (jZzh == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.zza.pop();
    }

    public final void zzd() throws IOException {
        long jZzh = zzh();
        if (jZzh != -1) {
            if (jZzh != -2) {
                return;
            } else {
                jZzh = -2;
            }
        }
        throw new IOException(r.a("expected non-string scope but found ", jZzh));
    }

    public final void zze(long j10) throws IOException {
        long jZzh = zzh();
        if (jZzh != j10) {
            if (jZzh != -1) {
                if (jZzh != -2) {
                    return;
                } else {
                    jZzh = -2;
                }
            }
            StringBuilder sbA = y.a("expected non-string scope or scope ", " but found ", j10);
            sbA.append(jZzh);
            throw new IOException(sbA.toString());
        }
    }

    public final void zzf() {
        long jZzh = zzh();
        if (jZzh == 1) {
            this.zza.pop();
            return;
        }
        if (jZzh > 1) {
            zzi(jZzh - 1);
        } else if (jZzh == -4) {
            zzi(-5L);
        } else if (jZzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j10) {
        this.zza.push(Long.valueOf(j10));
    }
}
