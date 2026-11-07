package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ld2 {

    /* renamed from: c, reason: collision with root package name */
    public static final ld2 f6671c = new ld2(bo1.n(id2.f5720d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final cp1 f6672d;

    /* renamed from: e, reason: collision with root package name */
    public static final ip1 f6673e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6674a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f6675b;

    static {
        Object[] objArr = {2, 5, 6};
        ap1.a(objArr, 3);
        f6672d = bo1.k(objArr, 3);
        do1 do1Var = new do1(4);
        do1Var.a(5, 6);
        do1Var.a(17, 6);
        do1Var.a(7, 6);
        do1Var.a(30, 10);
        do1Var.a(18, 6);
        do1Var.a(6, 8);
        do1Var.a(8, 8);
        do1Var.a(14, 8);
        f6673e = do1Var.b();
    }

    public ld2(cp1 cp1Var) {
        for (int i6 = 0; i6 < cp1Var.f3638v; i6++) {
            id2 id2Var = (id2) cp1Var.get(i6);
            this.f6674a.put(id2Var.f5721a, id2Var);
        }
        int iMax = 0;
        for (int i7 = 0; i7 < this.f6674a.size(); i7++) {
            iMax = Math.max(iMax, ((id2) this.f6674a.valueAt(i7)).f5722b);
        }
        this.f6675b = iMax;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static ld2 b(Context context, gy0 gy0Var, ck1 ck1Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), gy0Var, ck1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0276  */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ld2 c(Context context, Intent intent, gy0 gy0Var, ck1 ck1Var) {
        ck1 ck1Var2;
        int i6;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (ck1Var == null) {
            ck1Var2 = null;
            if (j31.f5914a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(gy0Var.a().f6595a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        ck1Var2 = new ck1(19, (AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
        } else {
            ck1Var2 = ck1Var;
        }
        int i7 = j31.f5914a;
        ip1 ip1Var = f6673e;
        if (i7 >= 33 && (j31.e(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(gy0Var.a().f6595a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(ed0.u(12)));
            for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
                AudioProfile audioProfileB = ed2.b(directProfilesForAttributes.get(i8));
                if (audioProfileB.getEncapsulationType() != 1) {
                    int format = audioProfileB.getFormat();
                    if (j31.c(format) || ip1Var.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(ed0.u(audioProfileB.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(ed0.u(audioProfileB.getChannelMasks())));
                        }
                    }
                }
            }
            yn1 yn1Var = new yn1();
            for (Map.Entry entry : map.entrySet()) {
                yn1Var.q(new id2(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new ld2(yn1Var.t());
        }
        if (i7 >= 23) {
            AudioDeviceInfo[] devices = ck1Var2 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) ck1Var2.f3613t};
            fo1 fo1Var = new fo1(4);
            Integer[] numArr = {8, 7};
            if (fo1Var.f4742w != null) {
                for (int i9 = 0; i9 < 2; i9++) {
                    fo1Var.t(numArr[i9]);
                }
            } else {
                ap1.a(numArr, 2);
                fo1Var.s(2);
                System.arraycopy(numArr, 0, fo1Var.f9901t, fo1Var.f9902u, 2);
                fo1Var.f9902u += 2;
            }
            if (i7 >= 31) {
                Integer[] numArr2 = {26, 27};
                if (fo1Var.f4742w != null) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        fo1Var.t(numArr2[i10]);
                    }
                } else {
                    ap1.a(numArr2, 2);
                    fo1Var.s(2);
                    System.arraycopy(numArr2, 0, fo1Var.f9901t, fo1Var.f9902u, 2);
                    fo1Var.f9902u += 2;
                }
            }
            if (i7 >= 33) {
                fo1Var.t(30);
            }
            go1 go1VarV = fo1Var.v();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (go1VarV.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f6671c;
                }
            }
        }
        fo1 fo1Var2 = new fo1(4);
        fo1Var2.t(2);
        int i11 = j31.f5914a;
        if (i11 >= 29 && (j31.e(context) || (i11 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            yn1 yn1Var2 = new yn1();
            go1 go1VarD = ip1Var.f4362t;
            if (go1VarD == null) {
                go1VarD = ip1Var.d();
                ip1Var.f4362t = go1VarD;
            }
            up1 it = go1VarD.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (j31.f5914a >= j31.l(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), gy0Var.a().f6595a)) {
                    yn1Var2.q(num);
                }
            }
            yn1Var2.q(2);
            fo1Var2.u(yn1Var2.t());
            return new ld2(d(ed0.v(fo1Var2.v()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z6) {
            String str = j31.f5916c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                i6 = 1;
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    fo1Var2.u(f6672d);
                }
            } else {
                i6 = 1;
            }
        }
        if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != i6) {
            return new ld2(d(ed0.v(fo1Var2.v()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            fo1Var2.u(ed0.u(intArrayExtra));
        }
        return new ld2(d(ed0.v(fo1Var2.v()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static cp1 d(int[] iArr, int i6) {
        yn1 yn1Var = new yn1();
        for (int i7 : iArr) {
            yn1Var.q(new id2(i7, i6));
        }
        return yn1Var.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r1
      0x003f: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:11:0x0033, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(w wVar, gy0 gy0Var) {
        String str = wVar.f9978m;
        str.getClass();
        int iA = bk.a(str, wVar.f9975j);
        Integer numValueOf = Integer.valueOf(iA);
        ip1 ip1Var = f6673e;
        if (!ip1Var.containsKey(numValueOf)) {
            return null;
        }
        int i6 = 8;
        SparseArray sparseArray = this.f6674a;
        if (iA != 18) {
            if (iA == 8) {
                if (sparseArray.indexOfKey(8) >= 0) {
                    iA = 8;
                    if (iA == 30) {
                    }
                }
                iA = 7;
            } else if (iA == 30 && sparseArray.indexOfKey(30) < 0) {
                iA = 7;
            }
        } else if (sparseArray.indexOfKey(18) >= 0) {
            iA = 18;
            if (iA == 8) {
            }
        } else {
            iA = 6;
        }
        if (sparseArray.indexOfKey(iA) < 0) {
            return null;
        }
        id2 id2Var = (id2) sparseArray.get(iA);
        id2Var.getClass();
        int iIntValue = id2Var.f5722b;
        go1 go1Var = id2Var.f5723c;
        int i7 = wVar.B;
        boolean zContains = false;
        if (i7 == -1 || iA == 18) {
            int i8 = wVar.C;
            if (i8 == -1) {
                i8 = 48000;
            }
            int i9 = id2Var.f5721a;
            if (go1Var == null) {
                if (j31.f5914a >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iM = j31.m(iIntValue);
                        if (iM != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i8).setChannelMask(iM).build(), gy0Var.a().f6595a)) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = ip1Var.get(Integer.valueOf(i9));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i7 = iIntValue;
        } else if (!wVar.f9978m.equals("audio/vnd.dts.uhd;profile=p2") || j31.f5914a >= 33) {
            if (go1Var != null) {
                int iM2 = j31.m(i7);
                if (iM2 != 0) {
                    zContains = go1Var.contains(Integer.valueOf(iM2));
                }
            } else if (i7 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i7 > 10) {
            return null;
        }
        int i10 = j31.f5914a;
        if (i10 > 28) {
            i6 = i7;
        } else if (i7 != 7) {
            if (i7 == 3 || i7 == 4 || i7 == 5) {
                i6 = 6;
            }
        }
        if (i10 <= 26 && "fugu".equals(j31.f5915b) && i6 == 1) {
            i6 = 2;
        }
        int iM3 = j31.m(i6);
        if (iM3 != 0) {
            return Pair.create(Integer.valueOf(iA), Integer.valueOf(iM3));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ld2) {
            ld2 ld2Var = (ld2) obj;
            SparseArray sparseArray = ld2Var.f6674a;
            int i6 = j31.f5914a;
            SparseArray sparseArray2 = this.f6674a;
            if (i6 < 31) {
                int size = sparseArray2.size();
                if (size == sparseArray.size()) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (!Objects.equals(sparseArray2.valueAt(i7), sparseArray.get(sparseArray2.keyAt(i7)))) {
                            break;
                        }
                    }
                    if (this.f6675b != ld2Var.f6675b) {
                        break;
                    }
                }
            } else if (sparseArray2.contentEquals(sparseArray)) {
                if (this.f6675b != ld2Var.f6675b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i6 = j31.f5914a;
        SparseArray sparseArray = this.f6674a;
        if (i6 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i7)) + ((sparseArray.keyAt(i7) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f6675b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f6675b + ", audioProfiles=" + this.f6674a.toString() + "]";
    }
}
