package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nd2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f7422a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pd2 f7424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(pd2 pd2Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f7424c = pd2Var;
        this.f7422a = contentResolver;
        this.f7423b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        pd2 pd2Var = this.f7424c;
        pd2Var.b(ld2.b(pd2Var.f8041a, pd2Var.h, pd2Var.f8047g));
    }
}
