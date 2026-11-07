package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class md2 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd2 f7097a;

    public /* synthetic */ md2(pd2 pd2Var) {
        this.f7097a = pd2Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        pd2 pd2Var = this.f7097a;
        pd2Var.b(ld2.b(pd2Var.f8041a, pd2Var.h, pd2Var.f8047g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        pd2 pd2Var = this.f7097a;
        ck1 ck1Var = pd2Var.f8047g;
        int i6 = j31.f5914a;
        int length = audioDeviceInfoArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i7], ck1Var)) {
                pd2Var.f8047g = null;
                break;
            }
            i7++;
        }
        pd2Var.b(ld2.b(pd2Var.f8041a, pd2Var.h, pd2Var.f8047g));
    }
}
