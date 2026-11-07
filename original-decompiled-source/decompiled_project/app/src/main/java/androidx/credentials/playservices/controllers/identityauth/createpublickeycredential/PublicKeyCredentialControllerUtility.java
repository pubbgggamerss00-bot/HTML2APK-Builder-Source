package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.protobuf.DescriptorProtos;
import d4.b1;
import db.a0;
import db.c0;
import db.e0;
import db.u;
import db.y;
import f4.b0;
import f4.z;
import ga.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mh.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qg.j0;
import qg.k0;

/* loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<db.q, f4.e> orderedErrorCodeToExceptions;
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        private final byte[] getChallenge(JSONObject jSONObject) throws JSONException {
            String strOptString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth(), "");
            kotlin.jvm.internal.r.b(strOptString);
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j10) throws PackageManager.NameNotFoundException {
            if (pa.d.f21387d.c(context, pa.e.f21388a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            kotlin.jvm.internal.r.d(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            kotlin.jvm.internal.r.d(packageInfo, "getPackageInfo(...)");
            return GetGMSVersion.getVersionLong(packageInfo) > j10;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            kotlin.jvm.internal.r.e(clientDataJSON, "clientDataJSON");
            kotlin.jvm.internal.r.e(attestationObject, "attestationObject");
            kotlin.jvm.internal.r.e(transportArray, "transportArray");
            kotlin.jvm.internal.r.e(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            kotlin.jvm.internal.r.e(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            kotlin.jvm.internal.r.d(bArrDecode, "decode(...)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            kotlin.jvm.internal.r.e(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            kotlin.jvm.internal.r.d(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        public final e4.o beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(db.q code, String str) {
            kotlin.jvm.internal.r.e(code, "code");
            f4.e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(code);
            return eVar == null ? new g4.c(new b0(), m3.a.a("unknown fido gms exception - ", str)) : (code == db.q.NOT_ALLOWED_ERR && str != null && x.r(str, "Unable to get sync account", false)) ? new e4.m("Passkey retrieval was cancelled by the user.") : new g4.c(eVar, str);
        }

        public final boolean checkAlgSupported(int i10) {
            try {
                db.o.a(i10);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final db.u convert(d4.i request, Context context) {
            kotlin.jvm.internal.r.e(request, "request");
            kotlin.jvm.internal.r.e(context, "context");
            return isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE) ? new db.u() : convertJSON$credentials_play_services_auth(new JSONObject((String) null));
        }

        public final db.u convertJSON$credentials_play_services_auth(JSONObject json) throws JSONException, g4.a {
            kotlin.jvm.internal.r.e(json, "json");
            u.a aVar = new u.a();
            parseRequiredChallengeAndUser$credentials_play_services_auth(json, aVar);
            parseRequiredRpAndParams$credentials_play_services_auth(json, aVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(json, aVar);
            parseOptionalTimeout$credentials_play_services_auth(json, aVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth(json, aVar);
            parseOptionalExtensions$credentials_play_services_auth(json, aVar);
            y yVar = aVar.f7798a;
            a0 a0Var = aVar.f7799b;
            byte[] bArr = aVar.f7800c;
            ArrayList arrayList = aVar.f7801d;
            Double d10 = aVar.f7802e;
            ArrayList arrayList2 = aVar.f7803f;
            db.k kVar = aVar.f7804g;
            db.c cVar = aVar.f7805h;
            return new db.u(yVar, a0Var, bArr, arrayList, d10, arrayList2, kVar, null, null, cVar == null ? null : cVar.f7682a, aVar.f7806i, null, null);
        }

        public final b.C0104b convertToPlayAuthPasskeyJsonRequest(b1 option) {
            kotlin.jvm.internal.r.e(option, "option");
            return new b.C0104b(true, null);
        }

        @pg.d
        public final b.c convertToPlayAuthPasskeyRequest(b1 option) {
            kotlin.jvm.internal.r.e(option, "option");
            JSONObject jSONObject = new JSONObject((String) null);
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth(), "");
            kotlin.jvm.internal.r.b(strOptString);
            if (strOptString.length() != 0) {
                return new b.c(strOptString, true, getChallenge(jSONObject));
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<db.q, f4.e> getOrderedErrorCodeToExceptions$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth(JSONObject json, u.a builder) throws JSONException {
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth());
                boolean zOptBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth(), false);
                String strOptString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth(), "");
                kotlin.jvm.internal.r.b(strOptString);
                c0 c0VarA = strOptString.length() > 0 ? c0.a(strOptString) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String strOptString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth(), "");
                kotlin.jvm.internal.r.b(strOptString2);
                db.b bVarA = strOptString2.length() > 0 ? db.b.a(strOptString2) : null;
                builder.f7804g = new db.k(bVarA == null ? null : bVarA.f7676a, boolValueOf, null, c0VarA == null ? null : c0VarA.f7685a);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth(JSONObject json, u.a builder) throws JSONException {
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth());
                String strOptString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth(), "");
                kotlin.jvm.internal.r.b(strOptString);
                builder.f7806i = new db.d(strOptString.length() > 0 ? new db.r(strOptString) : null, null, jSONObject.optBoolean("uvm", false) ? new e0(true) : null, null, null, null, null, null, jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth(), false) ? new db.s(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth(JSONObject json, u.a builder) {
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth())) {
                builder.f7802e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth()) / DescriptorProtos.Edition.EDITION_2023_VALUE);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(JSONObject json, u.a builder) throws JSONException, g4.a {
            ArrayList arrayList;
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth());
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
                    kotlin.jvm.internal.r.d(string, "getString(...)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth());
                    kotlin.jvm.internal.r.b(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth());
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i11)));
                            } catch (Transport.a e10) {
                                throw new g4.a(new f4.f(), e10.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new db.v(string2, bArrB64Decode, arrayList));
                }
            }
            builder.f7803f = arrayList2;
            String strOptString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth(), "none");
            kotlin.jvm.internal.r.b(strOptString);
            builder.f7805h = db.c.a(strOptString.length() != 0 ? strOptString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth(JSONObject json, u.a builder) throws JSONException {
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            byte[] challenge = getChallenge(json);
            com.google.android.gms.common.internal.p.f(challenge);
            builder.f7800c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            kotlin.jvm.internal.r.d(string, "getString(...)");
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            kotlin.jvm.internal.r.b(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            kotlin.jvm.internal.r.b(string2);
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.f7799b = new a0(bArrB64Decode, string2, strOptString, string3);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth(JSONObject json, u.a builder) throws JSONException {
            kotlin.jvm.internal.r.e(json, "json");
            kotlin.jvm.internal.r.e(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth(), "");
            String strOptString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            kotlin.jvm.internal.r.b(strOptString2);
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            kotlin.jvm.internal.r.b(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            kotlin.jvm.internal.r.b(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.f7798a = new y(string, strOptString, strOptString2);
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                int i11 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth());
                String strOptString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth(), "");
                kotlin.jvm.internal.r.b(strOptString3);
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i11)) {
                    arrayList.add(new db.w(strOptString3, i11));
                }
            }
            builder.f7801d = arrayList;
        }

        public final e4.g publicKeyCredentialResponseContainsError(db.t cred) {
            kotlin.jvm.internal.r.e(cred, "cred");
            qa.c cVar = cred.f7775d;
            if (cVar == null && (cVar = cred.f7776e) == null && (cVar = cred.f7777f) == null) {
                throw new IllegalStateException("No response set.");
            }
            if (!(cVar instanceof db.i)) {
                return null;
            }
            db.i iVar = (db.i) cVar;
            db.q qVar = iVar.f7730a;
            kotlin.jvm.internal.r.d(qVar, "getErrorCode(...)");
            f4.e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(qVar);
            String str = iVar.f7731b;
            return eVar == null ? new g4.a(new b0(), m3.a.a("unknown fido gms exception - ", str)) : (qVar == db.q.NOT_ALLOWED_ERR && str != null && x.r(str, "Unable to get sync account", false)) ? new e4.e("Passkey registration was cancelled by the user.") : new g4.a(eVar, str);
        }

        public final String toAssertPasskeyResponse(ga.l cred) {
            Object obj;
            kotlin.jvm.internal.r.e(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            db.t tVar = cred.f11902j;
            if (tVar != null) {
                obj = tVar.f7775d;
                if (obj == null && (obj = tVar.f7776e) == null && (obj = tVar.f7777f) == null) {
                    throw new IllegalStateException("No response set.");
                }
            } else {
                obj = null;
            }
            kotlin.jvm.internal.r.b(obj);
            if (obj instanceof db.i) {
                db.i iVar = (db.i) obj;
                db.q qVar = iVar.f7730a;
                kotlin.jvm.internal.r.d(qVar, "getErrorCode(...)");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(qVar, iVar.f7731b);
            }
            if (!(obj instanceof db.g)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String string = jSONObject.toString();
                kotlin.jvm.internal.r.d(string, "toString(...)");
                return string;
            }
            try {
                String string2 = tVar.d().toString();
                kotlin.jvm.internal.r.d(string2, "toJson(...)");
                return string2;
            } catch (Throwable th2) {
                throw new e4.r("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
            }
        }

        private Companion() {
        }
    }

    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo info) {
            kotlin.jvm.internal.r.e(info, "info");
            return info.getLongVersionCode();
        }
    }

    static {
        pg.n[] nVarArr = {new pg.n(db.q.UNKNOWN_ERR, new b0()), new pg.n(db.q.ABORT_ERR, new f4.a()), new pg.n(db.q.ATTESTATION_NOT_PRIVATE_ERR, new f4.r()), new pg.n(db.q.CONSTRAINT_ERR, new f4.b()), new pg.n(db.q.DATA_ERR, new f4.d()), new pg.n(db.q.INVALID_STATE_ERR, new f4.l()), new pg.n(db.q.ENCODING_ERR, new f4.f()), new pg.n(db.q.NETWORK_ERR, new f4.n()), new pg.n(db.q.NOT_ALLOWED_ERR, new f4.p()), new pg.n(db.q.NOT_SUPPORTED_ERR, new f4.s()), new pg.n(db.q.SECURITY_ERR, new f4.x()), new pg.n(db.q.TIMEOUT_ERR, new z())};
        LinkedHashMap<db.q, f4.e> linkedHashMap = new LinkedHashMap<>(j0.a(12));
        k0.h(linkedHashMap, nVarArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final db.u convert(d4.i iVar, Context context) {
        return Companion.convert(iVar, context);
    }
}
