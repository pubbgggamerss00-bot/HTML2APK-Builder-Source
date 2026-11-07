package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import d4.b1;
import d4.v;
import d4.x0;
import ga.b;

/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        private final b.a convertToGoogleIdTokenOption(lb.a aVar) {
            b.a.C0103a c0103aD = b.a.d();
            aVar.getClass();
            c0103aD.f11874b = false;
            com.google.android.gms.common.internal.p.d(null);
            c0103aD.f11873a = true;
            return c0103aD.a();
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            kotlin.jvm.internal.r.d(context.getPackageManager(), "getPackageManager(...)");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j10) {
            return j10 < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final ga.b constructBeginSignInRequest$credentials_play_services_auth(x0 request, Context context) {
            kotlin.jvm.internal.r.e(request, "request");
            kotlin.jvm.internal.r.e(context, "context");
            boolean z10 = false;
            b.d dVar = new b.d(false);
            b.a.C0103a c0103aD = b.a.d();
            c0103aD.f11873a = false;
            b.a aVarA = c0103aD.a();
            b.c cVar = new b.c(null, false, null);
            b.C0104b c0104b = new b.C0104b(false, null);
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            b.C0104b c0104b2 = c0104b;
            b.c cVar2 = cVar;
            b.a aVarConvertToGoogleIdTokenOption = aVarA;
            for (v vVar : request.f7366a) {
                if ((vVar instanceof b1) && !z10) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        b.c cVarConvertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((b1) vVar);
                        com.google.android.gms.common.internal.p.f(cVarConvertToPlayAuthPasskeyRequest);
                        cVar2 = cVarConvertToPlayAuthPasskeyRequest;
                    } else {
                        b.C0104b c0104bConvertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((b1) vVar);
                        com.google.android.gms.common.internal.p.f(c0104bConvertToPlayAuthPasskeyJsonRequest);
                        c0104b2 = c0104bConvertToPlayAuthPasskeyJsonRequest;
                    }
                    z10 = true;
                } else if (vVar instanceof lb.a) {
                    aVarConvertToGoogleIdTokenOption = convertToGoogleIdTokenOption((lb.a) vVar);
                    com.google.android.gms.common.internal.p.f(aVarConvertToGoogleIdTokenOption);
                }
            }
            return new ga.b(dVar, aVarConvertToGoogleIdTokenOption, null, false, 0, cVar2, c0104b2, false);
        }

        private Companion() {
        }
    }
}
