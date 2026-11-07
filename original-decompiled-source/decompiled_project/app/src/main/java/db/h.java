package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new w1();

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f7723a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7724b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f7725c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f7726d;

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.p.f(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.f(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.p.f(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        com.google.android.gms.common.internal.p.f(zzgxVarZzl);
        this.f7723a = zzgxVarZzl;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl2);
        this.f7724b = zzgxVarZzl2;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl3);
        this.f7725c = zzgxVarZzl3;
        com.google.android.gms.common.internal.p.f(strArr);
        this.f7726d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: JSONException -> 0x001b, zzho -> 0x0188, TRY_LEAVE, TryCatch #2 {zzho -> 0x0188, blocks: (B:34:0x00ee, B:40:0x010d, B:42:0x011f, B:47:0x0133, B:50:0x0155, B:52:0x016b, B:54:0x0171, B:57:0x018b, B:58:0x0190, B:59:0x0191, B:60:0x0196, B:65:0x01a1, B:67:0x01b1, B:69:0x01bf, B:70:0x01d2, B:71:0x01d7, B:72:0x01d8, B:73:0x01dd, B:78:0x01fe, B:79:0x0203), top: B:109:0x00ee, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe A[Catch: JSONException -> 0x001b, zzho -> 0x0188, TRY_ENTER, TryCatch #2 {zzho -> 0x0188, blocks: (B:34:0x00ee, B:40:0x010d, B:42:0x011f, B:47:0x0133, B:50:0x0155, B:52:0x016b, B:54:0x0171, B:57:0x018b, B:58:0x0190, B:59:0x0191, B:60:0x0196, B:65:0x01a1, B:67:0x01b1, B:69:0x01bf, B:70:0x01d2, B:71:0x01d7, B:72:0x01d8, B:73:0x01dd, B:78:0x01fe, B:79:0x0203), top: B:109:0x00ee, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject d() throws JSONException {
        zzhp zzhpVar;
        byte[] bArrZza;
        String[] strArr = this.f7726d;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f7724b;
            if (zzgxVar != null) {
                jSONObject.put("clientDataJSON", p9.d.c(zzgxVar.zzm()));
            }
            zzgx zzgxVar2 = this.f7725c;
            if (zzgxVar2 != null) {
                jSONObject.put("attestationObject", p9.d.c(zzgxVar2.zzm()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar2 = (zzhp) zzhp.zzj(zzgxVar2.zzm()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzgxVarZzc = zzhpVar2.zze().zzc();
                    ByteBuffer byteBufferZzi = zzgxVarZzc.zzi();
                    try {
                        byteBufferZzi.position(byteBufferZzi.position() + 32);
                        if ((byteBufferZzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferZzi.position(byteBufferZzi.position() + 4);
                        byteBufferZzi.position(byteBufferZzi.position() + 16);
                        byteBufferZzi.position(byteBufferZzi.position() + byteBufferZzi.getShort());
                        try {
                            zzhm zzhmVarZzh = zzhp.zzk(zzgxVarZzc.zzg(byteBufferZzi.position(), zzgxVarZzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar3 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar4 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar3 == null || zzhpVar4 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long jZzc = zzhpVar3.zzf().zzc();
                                long jZzc2 = zzhpVar4.zzf().zzc();
                                if (jZzc2 == 1) {
                                    zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                    if (zzhpVar != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jZzc3 = zzhpVar.zzf().zzc();
                                    if (jZzc2 == 2 && jZzc3 == 1) {
                                        zzhp zzhpVar5 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        zzhp zzhpVar6 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-3L));
                                        if (zzhpVar5 == null || zzhpVar6 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc2 = zzhpVar5.zze().zzc();
                                        zzgx zzgxVarZzc3 = zzhpVar6.zze().zzc();
                                        if (zzgxVarZzc2.zzd() != 32 || zzgxVarZzc3.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzgxVarZzc2.zzm(), zzgxVarZzc3.zzm());
                                    } else if (jZzc2 == 1 && jZzc3 == 6) {
                                        zzhp zzhpVar7 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc4 = zzhpVar7.zze().zzc();
                                        if (zzgxVarZzc4.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzgxVarZzc4.zzm());
                                    } else {
                                        bArrZza = null;
                                    }
                                } else {
                                    if (jZzc2 == 2) {
                                        jZzc2 = 2;
                                        zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                        if (zzhpVar != null) {
                                        }
                                    }
                                    bArrZza = null;
                                }
                                jSONObject.put("authenticatorData", p9.d.c(zzgxVarZzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", jZzc);
                                if (bArrZza != null) {
                                    jSONObject.put("publicKey", Base64.encodeToString(bArrZza, 11));
                                }
                                return jSONObject;
                            } catch (zzho e10) {
                                throw new IllegalArgumentException("COSE key ill-formed", e10);
                            }
                        } catch (zzhj e11) {
                            e = e11;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (zzho e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (zzhj e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.o.a(this.f7723a, hVar.f7723a) && com.google.android.gms.common.internal.o.a(this.f7724b, hVar.f7724b) && com.google.android.gms.common.internal.o.a(this.f7725c, hVar.f7725c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f7723a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7724b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f7725c}))});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f7723a.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f7724b.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f7725c.zzm();
        zzbiVarZza.zzb("attestationObject", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzbiVarZza.zzb("transports", Arrays.toString(this.f7726d));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.f(parcel, 2, this.f7723a.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 3, this.f7724b.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7725c.zzm(), false);
        String[] strArr = this.f7726d;
        if (strArr != null) {
            int iQ2 = androidx.lifecycle.c1.q(5, parcel);
            parcel.writeStringArray(strArr);
            androidx.lifecycle.c1.r(iQ2, parcel);
        }
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
