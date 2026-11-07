package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* loaded from: classes.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends kotlin.jvm.internal.p implements eh.p<String, String, e4.g> {
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // eh.p
    public final e4.g invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth(str, str2);
    }
}
