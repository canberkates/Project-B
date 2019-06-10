package nl.bakisen.opendag.Database;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

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

import javax.net.ssl.HttpsURLConnection;

//https://github.com/Faiizii/MySqlExample used as base

public class BackgroundTask extends AsyncTask<String,Void,String> {

    AlertDialog dialog;
    Context ctx;
    public Boolean login = false;

    public BackgroundTask(Context context) {
        this.ctx = context;
    }

    @Override
    protected void onPreExecute() {
//        used for testing
//        dialog = new AlertDialog.Builder(ctx).create();
//        dialog.setTitle("Login Status");
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
        String currenteducation = strings[7];
        String choseneducation = strings[8];

        if (method.equals("insert data november")) {
            String connection = "http://192.168.178.60/opendag/inschrijvennovember.php";
            try {
                URL url = new URL(connection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);

                OutputStream ops = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ops, "UTF-8"));
                String data = URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender, "UTF-8")
                        + "&&" + URLEncoder.encode("firstname", "UTF-8") + "=" + URLEncoder.encode(firstname, "UTF-8")
                        + "&&" + URLEncoder.encode("lastname", "UTF-8") + "=" + URLEncoder.encode(lastname, "UTF-8")
                        + "&&" + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8")
                        + "&&" + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8")
                        + "&&" + URLEncoder.encode("dateofbirth", "UTF-8") + "=" + URLEncoder.encode(dateofbirth, "UTF-8")
                        + "&&" + URLEncoder.encode("currenteducation", "UTF-8") + "=" + URLEncoder.encode(currenteducation, "UTF-8")
                        + "&&" + URLEncoder.encode("choseneducation", "UTF-8") + "=" + URLEncoder.encode(choseneducation, "UTF-8");

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

        } else if (method.equals("insert data februari")) {
            String connection = "http://192.168.178.60/opendag/inschrijvenfebruari.php";
            try {
                URL url = new URL(connection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);

                OutputStream ops = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ops, "UTF-8"));
                String data = URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender, "UTF-8")
                        + "&&" + URLEncoder.encode("firstname", "UTF-8") + "=" + URLEncoder.encode(firstname, "UTF-8")
                        + "&&" + URLEncoder.encode("lastname", "UTF-8") + "=" + URLEncoder.encode(lastname, "UTF-8")
                        + "&&" + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8")
                        + "&&" + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8")
                        + "&&" + URLEncoder.encode("dateofbirth", "UTF-8") + "=" + URLEncoder.encode(dateofbirth, "UTF-8")
                        + "&&" + URLEncoder.encode("currenteducation", "UTF-8") + "=" + URLEncoder.encode(currenteducation, "UTF-8")
                        + "&&" + URLEncoder.encode("choseneducation", "UTF-8") + "=" + URLEncoder.encode(choseneducation, "UTF-8");

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

        } else if (method.equals("insert data april")) {
            String connection = "http://192.168.178.60/opendag/inschrijvenapril.php";
            try {
                URL url = new URL(connection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);

                OutputStream ops = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ops, "UTF-8"));
                String data = URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender, "UTF-8")
                        + "&&" + URLEncoder.encode("firstname", "UTF-8") + "=" + URLEncoder.encode(firstname, "UTF-8")
                        + "&&" + URLEncoder.encode("lastname", "UTF-8") + "=" + URLEncoder.encode(lastname, "UTF-8")
                        + "&&" + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8")
                        + "&&" + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8")
                        + "&&" + URLEncoder.encode("dateofbirth", "UTF-8") + "=" + URLEncoder.encode(dateofbirth, "UTF-8")
                        + "&&" + URLEncoder.encode("currenteducation", "UTF-8") + "=" + URLEncoder.encode(currenteducation, "UTF-8")
                        + "&&" + URLEncoder.encode("choseneducation", "UTF-8") + "=" + URLEncoder.encode(choseneducation, "UTF-8");

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

//        dialog.setMessage(s);
//        dialog.show();
//        if (s.contains("login ok")) {
//            Intent home = new Intent();
//            home.setClass(ctx.getApplicationContext(), HomeActivity.class);
//            ctx.startActivity(home);
//        }

    }
}
