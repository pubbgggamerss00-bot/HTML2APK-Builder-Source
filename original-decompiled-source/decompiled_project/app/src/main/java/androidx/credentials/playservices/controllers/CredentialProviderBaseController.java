package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import e4.e;
import e4.g;
import e4.h;
import e4.k;
import e4.m;
import e4.p;
import e4.t;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import qg.o;

/* loaded from: classes.dex */
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String EXTRA_DIGITAL_CREDENTIAL_INTENT = "EXTRA_DIGITAL_CREDENTIAL_INTENT";
    public static final String EXTRA_ERROR_NAME = "EXTRA_ERROR_NAME";
    public static final String EXTRA_FLOW_PENDING_INTENT = "EXTRA_FLOW_PENDING_INTENT";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> retryables = o.C(new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$credentials_play_services_auth$annotations() {
        }

        public final g createCredentialExceptionTypeToException$credentials_play_services_auth(String str, String str2) {
            return r.a(str, CredentialProviderBaseController.CREATE_CANCELED) ? new e(str2) : r.a(str, CredentialProviderBaseController.CREATE_INTERRUPTED) ? new h(str2) : new k(str2);
        }

        public final int getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final e4.o getCredentialExceptionTypeToException$credentials_play_services_auth(String str, String str2) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new t(str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new p(str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new m(str2);
                }
            }
            return new e4.r(str2);
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public final void reportError$credentials_play_services_auth(ResultReceiver resultReceiver, String errName, String errMsg) {
            r.e(resultReceiver, "<this>");
            r.e(errName, "errName");
            r.e(errMsg, "errMsg");
            Bundle bundle = new Bundle();
            bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
            bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, errName);
            bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, errMsg);
            resultReceiver.send(Integer.MAX_VALUE, bundle);
        }

        public final void reportResult$credentials_play_services_auth(ResultReceiver resultReceiver, int i10, int i11, Intent intent) {
            r.e(resultReceiver, "<this>");
            Bundle bundle = new Bundle();
            bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
            bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i10);
            bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
            resultReceiver.send(i11, bundle);
        }

        private Companion() {
        }
    }

    public CredentialProviderBaseController(Context context) {
        r.e(context, "context");
        this.context = context;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        r.e(resultReceiver, "resultReceiver");
        r.e(hiddenIntent, "hiddenIntent");
        r.e(typeTag, "typeTag");
        hiddenIntent.putExtra(TYPE_TAG, typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t3) {
        Parcel parcelObtain = Parcel.obtain();
        r.d(parcelObtain, "obtain(...)");
        r.b(t3);
        t3.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver;
    }
}
