package nl.bakisen.opendag.Database;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class DatabaseTask extends AsyncTask<String, Void, String> {

    Context context;
    public Boolean login = false;
    public DatabaseTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected String doInBackground(String... strings) {
        String result = "";
        String method = strings[0];
        String gender = strings[1];
        String firstname = strings[2];
        String lastname = strings[3];
        String phone = strings[4];
        String email = strings[5];
        String dateofbirth = strings[6];
        String education = strings[7];

        if (method.equals("insert data")) {
            String connection = "192.168.178.60/opendag/inschrijving.php";
            try {
                URL url = new URL(connection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);

                OutputStream ops = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ops, "UTF-8"));
                String data = URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender, "UTF-8") + "&&" +
                        URLEncoder.encode("firstname", "UTF-8") + "=" + URLEncoder.encode(firstname, "UTF-8") + "&&" +
                        URLEncoder.encode("lastname", "UTF-8") + "=" + URLEncoder.encode(lastname, "UTF-8") + "&&" +
                        URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8") + "&&" +
                        URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&&" +
                        URLEncoder.encode("dateofbirth", "UTF-8") + "=" + URLEncoder.encode(dateofbirth, "UTF-8") + "&&" +
                        URLEncoder.encode("education", "UTF-8") + "=" + URLEncoder.encode(education, "UTF-8");
                writer.write(data);
                writer.flush();
                writer.close();
                ops.close();

                InputStream ips = httpURLConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(ips, "ISO-8859-1"));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                reader.close();
                ips.close();
                httpURLConnection.disconnect();
                return result;


            } catch (MalformedURLException e) {
                result = e.getMessage();
            } catch (IOException e) {
                result = e.getMessage();
            }

            }

        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }











}
