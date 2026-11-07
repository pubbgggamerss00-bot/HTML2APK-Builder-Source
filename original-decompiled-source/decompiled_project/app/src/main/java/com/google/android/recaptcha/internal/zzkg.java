package com.google.android.recaptcha.internal;

import j2.y;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes2.dex */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch2) {
        this.zza = zzkdVar;
        if (ch2 != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzb = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzb;
        return Objects.hashCode(ch2) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf(y.a(charSequenceZze.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZze.length()) {
            long jZzb = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i12 >= zzkdVar.zzc) {
                    break;
                }
                jZzb <<= zzkdVar.zzb;
                if (i10 + i12 < charSequenceZze.length()) {
                    jZzb |= this.zza.zzb(charSequenceZze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzkdVar.zzd;
            int i15 = i13 * zzkdVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((jZzb >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += this.zza.zzc;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzjf.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zza.zzd, i11 - i12));
            i12 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i10) {
        return (int) (((this.zza.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i10) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i10, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzjf.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzjf.zza(i11 <= this.zza.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzkdVar.zzb) - i12);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j11) & zzkdVar2.zza));
            i12 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i12 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i12 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch2) {
        this(new zzkd(str, str2.toCharArray()), ch2);
    }
}
