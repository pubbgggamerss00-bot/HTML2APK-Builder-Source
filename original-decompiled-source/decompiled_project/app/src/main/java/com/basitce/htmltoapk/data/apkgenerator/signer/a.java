package com.basitce.htmltoapk.data.apkgenerator.signer;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import eh.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5673a;

    public /* synthetic */ a(int i10) {
        this.f5673a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5673a) {
            case 0:
                return KeystoreHelper.fingerprintHex$lambda$14(((Byte) obj).byteValue());
            default:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, "local", null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1537, -1, 15, null);
        }
    }
}
