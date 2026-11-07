package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzamx {
    private static final zzano<?, ?> zza = new zzanq();

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i10, true) * size;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zzb(list);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zzc(i10, 0) * size;
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i10, 0L) * size;
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zze(list);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * list.size()) + zzf(list);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zzg(list);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zzh(list);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zzi(list);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i10) * size) + zzj(list);
    }

    public static void zzk(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzn(i10, list, z10);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i10, List<zzajp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzakg.zzi(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzi += zzakg.zza(list.get(i11));
        }
        return iZzi;
    }

    public static int zzb(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzc = 0;
            while (i10 < size) {
                iZzc += zzakg.zzc(list.get(i10).intValue());
                i10++;
            }
            return iZzc;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzc2 = 0;
        while (i10 < size) {
            iZzc2 += zzakg.zzc(zzakzVar.zzb(i10));
            i10++;
        }
        return iZzc2;
    }

    public static void zzc(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzc(i10, list, z10);
    }

    public static void zzd(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzd(i10, list, z10);
    }

    public static int zze(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZze = 0;
            while (i10 < size) {
                iZze += zzakg.zze(list.get(i10).intValue());
                i10++;
            }
            return iZze;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZze2 = 0;
        while (i10 < size) {
            iZze2 += zzakg.zze(zzakzVar.zzb(i10));
            i10++;
        }
        return iZze2;
    }

    public static int zzf(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzd = 0;
            while (i10 < size) {
                iZzd += zzakg.zzd(list.get(i10).longValue());
                i10++;
            }
            return iZzd;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzd2 = 0;
        while (i10 < size) {
            iZzd2 += zzakg.zzd(zzalrVar.zzb(i10));
            i10++;
        }
        return iZzd2;
    }

    public static int zzg(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzakg.zzh(list.get(i10).intValue());
                i10++;
            }
            return iZzh;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzh2 = 0;
        while (i10 < size) {
            iZzh2 += zzakg.zzh(zzakzVar.zzb(i10));
            i10++;
        }
        return iZzh2;
    }

    public static int zzh(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzf = 0;
            while (i10 < size) {
                iZzf += zzakg.zzf(list.get(i10).longValue());
                i10++;
            }
            return iZzf;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzf2 = 0;
        while (i10 < size) {
            iZzf2 += zzakg.zzf(zzalrVar.zzb(i10));
            i10++;
        }
        return iZzf2;
    }

    public static int zzi(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakz)) {
            int iZzj = 0;
            while (i10 < size) {
                iZzj += zzakg.zzj(list.get(i10).intValue());
                i10++;
            }
            return iZzj;
        }
        zzakz zzakzVar = (zzakz) list;
        int iZzj2 = 0;
        while (i10 < size) {
            iZzj2 += zzakg.zzj(zzakzVar.zzb(i10));
            i10++;
        }
        return iZzj2;
    }

    public static int zzj(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalr)) {
            int iZzg = 0;
            while (i10 < size) {
                iZzg += zzakg.zzg(list.get(i10).longValue());
                i10++;
            }
            return iZzg;
        }
        zzalr zzalrVar = (zzalr) list;
        int iZzg2 = 0;
        while (i10 < size) {
            iZzg2 += zzakg.zzg(zzalrVar.zzb(i10));
            i10++;
        }
        return iZzg2;
    }

    public static int zza(int i10, List<zzamc> list, zzamv<?> zzamvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZza += zzakg.zza(i10, list.get(i11), zzamvVar);
        }
        return iZza;
    }

    public static int zzb(int i10, List<?> list, zzamv<?> zzamvVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzakg.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzalk) {
                iZza = zzakg.zza((zzalk) obj);
            } else {
                iZza = zzakg.zza((zzamc) obj, zzamvVar);
            }
            iZzi = iZza + iZzi;
        }
        return iZzi;
    }

    public static void zze(int i10, List<Long> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zze(i10, list, z10);
    }

    public static void zzf(int i10, List<Float> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzf(i10, list, z10);
    }

    public static void zzg(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzg(i10, list, z10);
    }

    public static void zzh(int i10, List<Long> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzh(i10, list, z10);
    }

    public static void zzi(int i10, List<Integer> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzi(i10, list, z10);
    }

    public static void zzj(int i10, List<Long> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzj(i10, list, z10);
    }

    public static int zza(int i10, Object obj, zzamv<?> zzamvVar) {
        if (obj instanceof zzalk) {
            return zzakg.zzb(i10, (zzalk) obj);
        }
        return zzakg.zzb(i10, (zzamc) obj, zzamvVar);
    }

    public static zzano<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzald zzaldVar, UB ub2, zzano<UT, UB> zzanoVar) {
        if (zzaldVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (zzaldVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, iIntValue, ub2, zzanoVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzaldVar.zza(iIntValue2)) {
                ub2 = (UB) zza(obj, i10, iIntValue2, ub2, zzanoVar);
                it.remove();
            }
        }
        return ub2;
    }

    public static int zzb(int i10, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzakg.zzi(i10) * size;
        if (!(list instanceof zzaln)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzajp) {
                    iZza = zzakg.zza((zzajp) obj);
                } else {
                    iZza = zzakg.zza((String) obj);
                }
                iZzi = iZza + iZzi;
                i11++;
            }
            return iZzi;
        }
        zzaln zzalnVar = (zzaln) list;
        while (i11 < size) {
            Object objZza = zzalnVar.zza(i11);
            if (objZza instanceof zzajp) {
                iZza2 = zzakg.zza((zzajp) objZza);
            } else {
                iZza2 = zzakg.zza((String) objZza);
            }
            iZzi = iZza2 + iZzi;
            i11++;
        }
        return iZzi;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzano<UT, UB> zzanoVar) {
        if (ub2 == null) {
            ub2 = zzanoVar.zzc(obj);
        }
        zzanoVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static void zzb(int i10, List<Double> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i10, list, z10);
    }

    public static <T, FT extends zzakt<FT>> void zza(zzakm<FT> zzakmVar, T t3, T t10) {
        zzakr<T> zzakrVarZza = zzakmVar.zza(t10);
        if (zzakrVarZza.zza.isEmpty()) {
            return;
        }
        zzakmVar.zzb(t3).zza((zzakr) zzakrVarZza);
    }

    public static void zzb(int i10, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i10, list, (zzamv) zzamvVar);
    }

    public static void zzb(int i10, List<String> list, zzaof zzaofVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i10, list);
    }

    public static <T> void zza(zzalz zzalzVar, T t3, T t10, long j10) {
        zzanp.zza(t3, j10, zzalzVar.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10)));
    }

    public static <T, UT, UB> void zza(zzano<UT, UB> zzanoVar, T t3, T t10) {
        zzanoVar.zzc(t3, zzanoVar.zza(zzanoVar.zzd(t3), zzanoVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzaky.class.isAssignableFrom(cls);
    }

    public static void zza(int i10, List<Boolean> list, zzaof zzaofVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i10, list, z10);
    }

    public static void zza(int i10, List<zzajp> list, zzaof zzaofVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i10, list, (zzamv) zzamvVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
