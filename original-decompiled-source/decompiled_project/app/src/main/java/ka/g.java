package ka;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class g extends com.google.android.gms.common.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f16237a;

    public g(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, GoogleSignInOptions googleSignInOptions, h.a aVar, h.b bVar) {
        GoogleSignInOptions.a aVar2;
        super(context, looper, 91, dVar, aVar, bVar);
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a();
            aVar2.f5881a = new HashSet();
            aVar2.f5888h = new HashMap();
            aVar2.f5881a = new HashSet(googleSignInOptions.f5872b);
            aVar2.f5882b = googleSignInOptions.f5875e;
            aVar2.f5883c = googleSignInOptions.f5876f;
            aVar2.f5884d = googleSignInOptions.f5874d;
            aVar2.f5885e = googleSignInOptions.f5877g;
            aVar2.f5886f = googleSignInOptions.f5873c;
            aVar2.f5887g = googleSignInOptions.f5878h;
            aVar2.f5888h = GoogleSignInOptions.e(googleSignInOptions.f5879j);
            aVar2.f5889i = googleSignInOptions.f5880k;
        } else {
            aVar2 = new GoogleSignInOptions.a();
            aVar2.f5881a = new HashSet();
            aVar2.f5888h = new HashMap();
        }
        aVar2.f5889i = zbat.zba();
        if (!dVar.f6092c.isEmpty()) {
            for (Scope scope : dVar.f6092c) {
                HashSet hashSet = aVar2.f5881a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar2.f5881a;
        if (hashSet2.contains(GoogleSignInOptions.f5869p)) {
            Scope scope2 = GoogleSignInOptions.f5868n;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar2.f5884d && (aVar2.f5886f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f5867m);
        }
        this.f16237a = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar2.f5886f, aVar2.f5884d, aVar2.f5882b, aVar2.f5883c, aVar2.f5885e, aVar2.f5887g, aVar2.f5888h, aVar2.f5889i);
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final Intent getSignInIntent() {
        Context context = getContext();
        m.f16240a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f16237a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean providesSignIn() {
        return true;
    }
}
