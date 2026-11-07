package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final /* synthetic */ class CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 extends p implements eh.p<String, String, e4.g> {
    public CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // eh.p
    public final e4.g invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth(str, str2);
    }
}
