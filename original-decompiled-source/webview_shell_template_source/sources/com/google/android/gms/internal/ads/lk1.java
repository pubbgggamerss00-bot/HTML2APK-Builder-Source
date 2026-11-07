package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lk1 extends me {

    /* renamed from: t, reason: collision with root package name */
    public IBinder f6786t;

    /* renamed from: u, reason: collision with root package name */
    public String f6787u;

    /* renamed from: v, reason: collision with root package name */
    public int f6788v;

    /* renamed from: w, reason: collision with root package name */
    public float f6789w;

    /* renamed from: x, reason: collision with root package name */
    public int f6790x;

    /* renamed from: y, reason: collision with root package name */
    public String f6791y;

    /* renamed from: z, reason: collision with root package name */
    public byte f6792z;

    public final mk1 q() {
        IBinder iBinder;
        if (this.f6792z == 31 && (iBinder = this.f6786t) != null) {
            return new mk1(iBinder, this.f6787u, this.f6788v, this.f6789w, this.f6790x, this.f6791y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6786t == null) {
            sb.append(" windowToken");
        }
        if ((this.f6792z & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f6792z & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f6792z & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f6792z & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f6792z & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
