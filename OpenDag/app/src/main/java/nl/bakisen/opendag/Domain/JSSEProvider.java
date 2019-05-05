package nl.bakisen.opendag.Domain;

import java.security.AccessController;
import java.security.Provider;


// https://stackoverflow.com/questions/2020088/sending-email-in-android-using-javamail-api-without-using-the-default-built-in-a code gebruikt om mail te versturen. geld voor de volgende classes:
// JSSEProvider, GMailSender, VraagFragment, InschrijvenFragment
// https://stackoverflow.com/questions/14374578/using-asynctask-to-send-android-email gebruikt om een asynctask te maken, zodat de mail verstuurd werd. geld voor de volgende classes:
// InschrijvenFragment, VraagFragment

public final class JSSEProvider extends Provider {

    public JSSEProvider() {
        super("HarmonyJSSE", 1.0, "Harmony JSSE Provider");
        AccessController.doPrivileged(new java.security.PrivilegedAction<Void>() {
            public Void run() {
                put("SSLContext.TLS",
                        "org.apache.harmony.xnet.provider.jsse.SSLContextImpl");
                put("Alg.Alias.SSLContext.TLSv1", "TLS");
                put("KeyManagerFactory.X509",
                        "org.apache.harmony.xnet.provider.jsse.KeyManagerFactoryImpl");
                put("TrustManagerFactory.X509",
                        "org.apache.harmony.xnet.provider.jsse.TrustManagerFactoryImpl");
                return null;
            }
        });
    }

}