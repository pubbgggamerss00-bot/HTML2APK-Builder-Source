package com.basitce.htmltoapk.data.apkgenerator.signer;

import android.content.Context;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.domain.model.BuildConfiguration;
import java.io.File;
import kotlin.jvm.internal.r;
import pg.t;

/* loaded from: classes.dex */
public final class SigningKeyResolver {
    public static final int $stable = 0;
    public static final SigningKeyResolver INSTANCE = new SigningKeyResolver();

    private SigningKeyResolver() {
    }

    public final SigningKey resolve(Context context, BuildConfiguration config) {
        r.e(context, "context");
        r.e(config, "config");
        String keystorePath = config.getKeystorePath();
        File file = keystorePath != null ? new File(keystorePath) : null;
        String keystorePassword = config.getKeystorePassword();
        if (keystorePassword == null) {
            keystorePassword = "";
        }
        String keyAlias = config.getKeyAlias();
        if (keyAlias == null) {
            keyAlias = KeystoreHelper.INSTANCE.getDefaultKeyAlias();
        }
        String keyPassword = config.getKeyPassword();
        if (keyPassword == null) {
            keyPassword = keystorePassword;
        }
        if (config.getUseCustomKeystore() && file != null && KeystoreHelper.INSTANCE.verifyKeystore(file, keystorePassword, keyAlias, keyPassword)) {
            BuildLogger.INSTANCE.detail(R.string.build_log_keystore_custom, new Object[0]);
            return new SigningKey(file, keystorePassword, keyAlias, keyPassword);
        }
        if (config.getUseCustomKeystore()) {
            BuildLogger.INSTANCE.detail(R.string.build_log_keystore_fallback, new Object[0]);
        } else {
            BuildLogger.INSTANCE.detail(R.string.build_log_keystore_app_specific, config.getProject().getPackageName());
        }
        t<File, String, String> orCreateAppKeystore = KeystoreHelper.INSTANCE.getOrCreateAppKeystore(context, config.getProject().getPackageName());
        File file2 = orCreateAppKeystore.f21479a;
        String str = orCreateAppKeystore.f21480b;
        return new SigningKey(file2, str, orCreateAppKeystore.f21481c, str);
    }
}
