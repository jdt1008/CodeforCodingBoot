package project.service;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class UserService {

	public static List<User> generateUserList() {
		return Arrays.asList(
					
					new User(1008, "Jakob", "Taylor", "9085919494", "jdt1008@sru.edu"));,
					new User(5967, "James", "Pham", "9083625035", "jxp5967@sru.edu"),
					new User(4323, "Evan", "White", "7242467256", "exw4323@sru.edu"),
					new User(1002, "Fady", "Aziz", "7242369857", "faa1002@sru.edu"),
					new User(6715, "Connor", "Barthen", "7246985375", "cnb1021@sru.edu"),
					new User(1563, "Nathan", "Barthen", "7249687412", "ncb1006@sru.edu"),
					new User(4323, "Gregory", "Bayne", "72436945178", "	geb1002@sru.edu"),
					new User(1007, "Ian", "Black", "7244968523", "imb1007@sru.edu"),
					new User(1045, "Michael", "Booser", "7247895045", "mlb1045@sru.edu"),
					new User(4658, "Brison", "Luke", "7245289145", "ldb1009@sru.edu"),
					new User(8962, "Kayleigh", "Burke", "9085816025", "kbb1008@sru.edu"));
					
		}

	}
