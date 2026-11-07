package com.google.android.gms.internal.fido;

import c2.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class zzhq {
    public static final zzhp zza(InputStream inputStream, zzhs zzhsVar) throws zzhj {
        try {
            return zzb(inputStream, zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzhp zzb(InputStream inputStream, zzhs zzhsVar) throws zzhf, zzhj {
        try {
            zzhr zzhrVarZzd = zzhsVar.zzd();
            if (zzhrVarZzd == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte bZza = zzhrVarZzd.zza();
                byte bZzb = zzhrVarZzd.zzb();
                int i10 = 0;
                if (bZzb == Byte.MIN_VALUE) {
                    long jZza = zzhsVar.zza();
                    if (jZza > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    zzc(bZza, jZza, inputStream, zzhsVar);
                    zzhp[] zzhpVarArr = new zzhp[(int) jZza];
                    while (i10 < jZza) {
                        zzhpVarArr[i10] = zzb(inputStream, zzhsVar);
                        i10++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (bZzb != -96) {
                    if (bZzb == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (bZzb == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (bZzb == 0 || bZzb == 32) {
                        long jZzb = zzhsVar.zzb();
                        zzc(bZza, jZzb > 0 ? jZzb : ~jZzb, inputStream, zzhsVar);
                        return new zzhk(jZzb);
                    }
                    if (bZzb == 64) {
                        byte[] bArrZzg = zzhsVar.zzg();
                        int length = bArrZzg.length;
                        zzc(bZza, length, inputStream, zzhsVar);
                        return new zzhi(zzgx.zzl(bArrZzg, 0, length));
                    }
                    if (bZzb == 96) {
                        String strZze = zzhsVar.zze();
                        zzc(bZza, strZze.length(), inputStream, zzhsVar);
                        return new zzhn(strZze);
                    }
                    throw new zzhj("Unidentifiable major type: " + zzhrVarZzd.zzc());
                }
                long jZzc = zzhsVar.zzc();
                if (jZzc > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                zzc(bZza, jZzc, inputStream, zzhsVar);
                int i11 = (int) jZzc;
                zzhl[] zzhlVarArr = new zzhl[i11];
                zzhp zzhpVar = null;
                int i12 = 0;
                while (i12 < jZzc) {
                    zzhp zzhpVarZzb = zzb(inputStream, zzhsVar);
                    if (zzhpVar != null && zzhpVarZzb.compareTo(zzhpVar) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + zzhpVar.toString() + "\nCurrent key: " + zzhpVarZzb.toString());
                    }
                    zzhlVarArr[i12] = new zzhl(zzhpVarZzb, zzb(inputStream, zzhsVar));
                    i12++;
                    zzhpVar = zzhpVarZzb;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    zzhl zzhlVar = zzhlVarArr[i10];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i10++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException e10) {
                e = e10;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e11) {
                e = e11;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e12) {
            throw new zzhj("Error in decoding CborValue from bytes", e12);
        }
    }

    private static final void zzc(byte b10, long j10, InputStream inputStream, zzhs zzhsVar) throws IOException {
        switch (b10) {
            case 24:
                if (j10 < 24) {
                    throw new zzhf(u.a("Integer value ", " after add info could have been represented in 0 additional bytes, but used 1", j10));
                }
                return;
            case 25:
                if (j10 < 256) {
                    throw new zzhf(u.a("Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2", j10));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new zzhf(u.a("Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4", j10));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new zzhf(u.a("Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8", j10));
                }
                return;
            default:
                return;
        }
    }
}
