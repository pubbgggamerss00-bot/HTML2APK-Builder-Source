package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakj implements zzaof {
    private final zzakg zza;

    private zzakj(zzakg zzakgVar) {
        zzakg zzakgVar2 = (zzakg) zzalb.zza(zzakgVar, "output");
        this.zza = zzakgVar2;
        zzakgVar2.zze = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaki)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzakg.zza(list.get(i12).doubleValue());
            }
            this.zza.zzn(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        zzaki zzakiVar = (zzaki) list;
        if (!z10) {
            while (i11 < zzakiVar.size()) {
                this.zza.zzb(i10, zzakiVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZza2 = 0;
        for (int i13 = 0; i13 < zzakiVar.size(); i13++) {
            iZza2 += zzakg.zza(zzakiVar.zzb(i13));
        }
        this.zza.zzn(iZza2);
        while (i11 < zzakiVar.size()) {
            this.zza.zzb(zzakiVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzc = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzc += zzakg.zzc(list.get(i12).intValue());
            }
            this.zza.zzn(iZzc);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzi(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzc2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZzc2 += zzakg.zzc(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZzc2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzd = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzd += zzakg.zzd(list.get(i12).intValue());
            }
            this.zza.zzn(iZzd);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzh(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzd2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZzd2 += zzakg.zzd(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZzd2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzalr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzc = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzc += zzakg.zzc(list.get(i12).longValue());
            }
            this.zza.zzn(iZzc);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z10) {
            while (i11 < zzalrVar.size()) {
                this.zza.zzf(i10, zzalrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzc2 = 0;
        for (int i13 = 0; i13 < zzalrVar.size(); i13++) {
            iZzc2 += zzakg.zzc(zzalrVar.zzb(i13));
        }
        this.zza.zzn(iZzc2);
        while (i11 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakx)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzakg.zza(list.get(i12).floatValue());
            }
            this.zza.zzn(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        if (!z10) {
            while (i11 < zzakxVar.size()) {
                this.zza.zzb(i10, zzakxVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZza2 = 0;
        for (int i13 = 0; i13 < zzakxVar.size(); i13++) {
            iZza2 += zzakg.zza(zzakxVar.zzb(i13));
        }
        this.zza.zzn(iZza2);
        while (i11 < zzakxVar.size()) {
            this.zza.zzb(zzakxVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzg(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZze = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZze += zzakg.zze(list.get(i12).intValue());
            }
            this.zza.zzn(iZze);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzi(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZze2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZze2 += zzakg.zze(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZze2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzh(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzalr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzd = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzd += zzakg.zzd(list.get(i12).longValue());
            }
            this.zza.zzn(iZzd);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z10) {
            while (i11 < zzalrVar.size()) {
                this.zza.zzh(i10, zzalrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzd2 = 0;
        for (int i13 = 0; i13 < zzalrVar.size(); i13++) {
            iZzd2 += zzakg.zzd(zzalrVar.zzb(i13));
        }
        this.zza.zzn(iZzd2);
        while (i11 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzi(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzg = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzg += zzakg.zzg(list.get(i12).intValue());
            }
            this.zza.zzn(iZzg);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzh(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzg2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZzg2 += zzakg.zzg(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZzg2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzj(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzalr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZze = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZze += zzakg.zze(list.get(i12).longValue());
            }
            this.zza.zzn(iZze);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z10) {
            while (i11 < zzalrVar.size()) {
                this.zza.zzf(i10, zzalrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZze2 = 0;
        for (int i13 = 0; i13 < zzalrVar.size(); i13++) {
            iZze2 += zzakg.zze(zzalrVar.zzb(i13));
        }
        this.zza.zzn(iZze2);
        while (i11 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzk(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzh = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzh += zzakg.zzh(list.get(i12).intValue());
            }
            this.zza.zzn(iZzh);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzj(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzh2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZzh2 += zzakg.zzh(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZzh2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzm(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzalr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzf = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzf += zzakg.zzf(list.get(i12).longValue());
            }
            this.zza.zzn(iZzf);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z10) {
            while (i11 < zzalrVar.size()) {
                this.zza.zzg(i10, zzalrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzf2 = 0;
        for (int i13 = 0; i13 < zzalrVar.size(); i13++) {
            iZzf2 += zzakg.zzf(zzalrVar.zzb(i13));
        }
        this.zza.zzn(iZzf2);
        while (i11 < zzalrVar.size()) {
            this.zza.zzi(zzalrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzm(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzakz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzj = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzj += zzakg.zzj(list.get(i12).intValue());
            }
            this.zza.zzn(iZzj);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z10) {
            while (i11 < zzakzVar.size()) {
                this.zza.zzl(i10, zzakzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzj2 = 0;
        for (int i13 = 0; i13 < zzakzVar.size(); i13++) {
            iZzj2 += zzakg.zzj(zzakzVar.zzb(i13));
        }
        this.zza.zzn(iZzj2);
        while (i11 < zzakzVar.size()) {
            this.zza.zzn(zzakzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzalr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzg = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzg += zzakg.zzg(list.get(i12).longValue());
            }
            this.zza.zzn(iZzg);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z10) {
            while (i11 < zzalrVar.size()) {
                this.zza.zzh(i10, zzalrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzg2 = 0;
        for (int i13 = 0; i13 < zzalrVar.size(); i13++) {
            iZzg2 += zzakg.zzg(zzalrVar.zzb(i13));
        }
        this.zza.zzn(iZzg2);
        while (i11 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i11));
            i11++;
        }
    }

    public static zzakj zza(zzakg zzakgVar) {
        zzakj zzakjVar = zzakgVar.zze;
        return zzakjVar != null ? zzakjVar : new zzakj(zzakgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, boolean z10) throws IOException {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzajn)) {
            if (z10) {
                this.zza.zzk(i10, 2);
                int iZza = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iZza += zzakg.zza(list.get(i12).booleanValue());
                }
                this.zza.zzn(iZza);
                while (i11 < list.size()) {
                    this.zza.zzb(list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        zzajn zzajnVar = (zzajn) list;
        if (z10) {
            this.zza.zzk(i10, 2);
            int iZza2 = 0;
            for (int i13 = 0; i13 < zzajnVar.size(); i13++) {
                iZza2 += zzakg.zza(zzajnVar.zzb(i13));
            }
            this.zza.zzn(iZza2);
            while (i11 < zzajnVar.size()) {
                this.zza.zzb(zzajnVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzajnVar.size()) {
            this.zza.zzb(i10, zzajnVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, Object obj, zzamv zzamvVar) throws IOException {
        this.zza.zzc(i10, (zzamc) obj, zzamvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, zzajp zzajpVar) throws IOException {
        this.zza.zzc(i10, zzajpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, List<?> list, zzamv zzamvVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i10, int i11) throws IOException {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, List<zzajp> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zzb(int i10) throws IOException {
        this.zza.zzk(i10, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, double d10) throws IOException {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof zzaln) {
            zzaln zzalnVar = (zzaln) list;
            while (i11 < list.size()) {
                Object objZza = zzalnVar.zza(i11);
                if (objZza instanceof String) {
                    this.zza.zzb(i10, (String) objZza);
                } else {
                    this.zza.zzc(i10, (zzajp) objZza);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zza(int i10) throws IOException {
        this.zza.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, int i11) throws IOException {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, float f10) throws IOException {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, Object obj, zzamv zzamvVar) throws IOException {
        zzakg zzakgVar = this.zza;
        zzakgVar.zzk(i10, 3);
        zzamvVar.zza((zzamv) obj, (zzaof) zzakgVar.zze);
        zzakgVar.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, List<?> list, zzamv zzamvVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final <K, V> void zza(int i10, zzalx<K, V> zzalxVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i10, 2);
            this.zza.zzn(zzalu.zza(zzalxVar, entry.getKey(), entry.getValue()));
            zzalu.zza(this.zza, zzalxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, Object obj) throws IOException {
        if (obj instanceof zzajp) {
            this.zza.zzd(i10, (zzajp) obj);
        } else {
            this.zza.zzb(i10, (zzamc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i10, String str) throws IOException {
        this.zza.zzb(i10, str);
    }
}
