package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f implements UserMessagingPlatform.b, z8 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f11718t;

    public /* synthetic */ f(int i6, Object obj) {
        this.s = i6;
        this.f11718t = obj;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.b
    public void b(com.google.android.ump.a aVar) {
        ((AtomicReference) this.f11718t).set(aVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        switch (this.s) {
            case 2:
                return new w((Application) ((a9) this.f11718t).zzb());
            default:
                return this.f11718t;
        }
    }

    public f(e eVar, s sVar) {
        this.s = 0;
        y8 y8VarA = y8.a(new f(2, eVar.f11695c));
        if (sVar == null) {
            throw new NullPointerException("instance cannot be null");
        }
        f fVar = new f(3, sVar);
        o7 o7Var = new o7(1);
        this.f11718t = o7Var;
        f fVar2 = eVar.f11695c;
        y8 y8Var = eVar.f11699g;
        i iVar = eVar.h;
        y8 y8Var2 = eVar.f11696d;
        y8 y8VarA2 = y8.a(new o(fVar2, eVar.f11697e, y8VarA, y8Var2, fVar, new v(y8VarA, new z(fVar2, y8VarA, y8Var, iVar, o7Var, y8Var2)), eVar.f11700i));
        if (((y8) o7Var.s) != null) {
            throw new IllegalStateException();
        }
        o7Var.s = y8VarA2;
    }
}
