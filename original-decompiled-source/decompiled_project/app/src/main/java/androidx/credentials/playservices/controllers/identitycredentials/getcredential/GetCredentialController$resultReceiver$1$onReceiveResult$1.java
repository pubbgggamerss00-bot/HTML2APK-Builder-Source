package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import e4.o;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final /* synthetic */ class GetCredentialController$resultReceiver$1$onReceiveResult$1 extends p implements eh.p<String, String, o> {
    public GetCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // eh.p
    public final o invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth(str, str2);
    }
}
