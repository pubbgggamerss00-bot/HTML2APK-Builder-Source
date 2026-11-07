package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakr<T extends zzakt<T>> {
    private static final zzakr<?> zzb = new zzakr<>(true);
    final zzamw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakr() {
        this.zza = new zzamz();
    }

    public static int zza(zzanw zzanwVar, int i10, Object obj) {
        int iZzi = zzakg.zzi(i10);
        if (zzanwVar == zzanw.zzj) {
            zzalb.zza((zzamc) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzanwVar, obj);
    }

    public static <T extends zzakt<T>> zzakr<T> zzb() {
        return (zzakr<T>) zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzakr zzakrVar = new zzakr();
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i10);
            zzakrVar.zzb((zzakt) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzakrVar.zzb((zzakt) entry.getKey(), entry.getValue());
        }
        zzakrVar.zzd = this.zzd;
        return zzakrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakr) {
            return this.zza.equals(((zzakr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzali(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzali(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            Object value = this.zza.zza(i10).getValue();
            if (value instanceof zzaky) {
                ((zzaky) value).zzs();
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzaky) {
                ((zzaky) value2).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZza = this.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            if (!zzc(this.zza.zza(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzalg;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzakr<T>) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zza(list.get(i10)));
            }
            this.zza.zza((zzamw<T, Object>) key, (T) objZza);
            return;
        }
        if (key.zzc() != zzaod.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzamw<T, Object>) key, (T) zza(value));
            return;
        }
        Object objZza2 = zza((zzakr<T>) key);
        if (objZza2 != null) {
            if (z10) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzamw<T, Object>) key, (T) (objZza2 instanceof zzaml ? key.zza((zzaml) objZza2, (zzaml) value) : key.zza(((zzamc) objZza2).zzr(), (zzamc) value).zze()));
        } else {
            this.zza.zza((zzamw<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private zzakr(zzamw<T, Object> zzamwVar) {
        this.zza = zzamwVar;
        zze();
    }

    private static int zza(zzanw zzanwVar, Object obj) {
        switch (zzakq.zzb[zzanwVar.ordinal()]) {
            case 1:
                return zzakg.zza(((Double) obj).doubleValue());
            case 2:
                return zzakg.zza(((Float) obj).floatValue());
            case 3:
                return zzakg.zzd(((Long) obj).longValue());
            case 4:
                return zzakg.zzg(((Long) obj).longValue());
            case 5:
                return zzakg.zze(((Integer) obj).intValue());
            case 6:
                return zzakg.zzc(((Long) obj).longValue());
            case 7:
                return zzakg.zzd(((Integer) obj).intValue());
            case 8:
                return zzakg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzakg.zza((zzamc) obj);
            case 10:
                if (obj instanceof zzalg) {
                    return zzakg.zza((zzalg) obj);
                }
                return zzakg.zzb((zzamc) obj);
            case 11:
                if (obj instanceof zzajp) {
                    return zzakg.zza((zzajp) obj);
                }
                return zzakg.zza((String) obj);
            case 12:
                if (obj instanceof zzajp) {
                    return zzakg.zza((zzajp) obj);
                }
                return zzakg.zza((byte[]) obj);
            case 13:
                return zzakg.zzj(((Integer) obj).intValue());
            case 14:
                return zzakg.zzg(((Integer) obj).intValue());
            case 15:
                return zzakg.zze(((Long) obj).longValue());
            case 16:
                return zzakg.zzh(((Integer) obj).intValue());
            case 17:
                return zzakg.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzala) {
                    return zzakg.zzc(((zzala) obj).zza());
                }
                return zzakg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t3, Object obj) {
        zzanw zzanwVarZzb = t3.zzb();
        zzalb.zza(obj);
        boolean z10 = true;
        switch (zzakq.zza[zzanwVarZzb.zzb().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case 6:
                z10 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzajp) && !(obj instanceof byte[])) {
                    z10 = false;
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzala)) {
                }
                break;
            case 9:
                if (!(obj instanceof zzamc) && !(obj instanceof zzalg)) {
                }
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t3.zza()), t3.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzakr(boolean z10) {
        this(new zzamz());
        zze();
    }

    private static <T extends zzakt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzaod.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!zzb(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t3, Object obj) {
        if (t3.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    zzc(t3, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t3, obj);
        }
        if (obj instanceof zzalg) {
            this.zzd = true;
        }
        this.zza.zza((zzamw<T, Object>) t3, (T) obj);
    }

    public static int zza(zzakt<?> zzaktVar, Object obj) {
        zzanw zzanwVarZzb = zzaktVar.zzb();
        int iZza = zzaktVar.zza();
        if (zzaktVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (!zzaktVar.zzd()) {
                int iZza2 = 0;
                while (i10 < size) {
                    iZza2 += zza(zzanwVarZzb, iZza, list.get(i10));
                    i10++;
                }
                return iZza2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iZza3 = 0;
            while (i10 < size) {
                iZza3 += zza(zzanwVarZzb, list.get(i10));
                i10++;
            }
            return zzakg.zzj(iZza3) + zzakg.zzi(iZza) + iZza3;
        }
        return zza(zzanwVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzame) {
            return ((zzame) obj).zzj();
        }
        if (obj instanceof zzalg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZza = this.zza.zza();
        int iZza2 = 0;
        for (int i10 = 0; i10 < iZza; i10++) {
            iZza2 += zza((Map.Entry) this.zza.zza(i10));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza2 += zza((Map.Entry) it.next());
        }
        return iZza2;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzaod.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzalg) {
                return zzakg.zza(entry.getKey().zza(), (zzalg) value);
            }
            return zzakg.zza(entry.getKey().zza(), (zzamc) value);
        }
        return zza((zzakt<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaml) {
            return ((zzaml) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t3) {
        Object obj = this.zza.get(t3);
        if (obj instanceof zzalg) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzakr<T> zzakrVar) {
        int iZza = zzakrVar.zza.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            zzb((Map.Entry) zzakrVar.zza.zza(i10));
        }
        Iterator it = zzakrVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzakg zzakgVar, zzanw zzanwVar, int i10, Object obj) throws IOException {
        if (zzanwVar == zzanw.zzj) {
            zzamc zzamcVar = (zzamc) obj;
            zzalb.zza(zzamcVar);
            zzakgVar.zzk(i10, 3);
            zzamcVar.zza(zzakgVar);
            zzakgVar.zzk(i10, 4);
        }
        zzakgVar.zzk(i10, zzanwVar.zza());
        switch (zzakq.zzb[zzanwVar.ordinal()]) {
            case 1:
                zzakgVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzakgVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzakgVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzakgVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzakgVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzakgVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzakgVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzakgVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzamc) obj).zza(zzakgVar);
                break;
            case 10:
                zzakgVar.zzc((zzamc) obj);
                break;
            case 11:
                if (obj instanceof zzajp) {
                    zzakgVar.zzb((zzajp) obj);
                    break;
                } else {
                    zzakgVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzajp) {
                    zzakgVar.zzb((zzajp) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzakgVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzakgVar.zzn(((Integer) obj).intValue());
                break;
            case 14:
                zzakgVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzakgVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzakgVar.zzm(((Integer) obj).intValue());
                break;
            case 17:
                zzakgVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzala) {
                    zzakgVar.zzl(((zzala) obj).zza());
                    break;
                } else {
                    zzakgVar.zzl(((Integer) obj).intValue());
                    break;
                }
        }
    }
}
